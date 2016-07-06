/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaiprange;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class IPAdrStruct {

    private short[] addr ;
    private final Pattern IP_PATTERN = Pattern.compile("(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");

    public IPAdrStruct() {
        this.addr = new short[4];
    }

    /**
     * **********************************
     */
    public short getAddr(int level) {
        return addr[level];
    }

    boolean setAddr(String value) {
        StringTokenizer st = new StringTokenizer(value, ".");
        Matcher ipmatcher = IP_PATTERN.matcher(value);
        if (!ipmatcher.matches()) {
            return false;
        } else {
            int i = 0;
            while (st.hasMoreTokens()) {
                this.addr[i++] = Short.parseShort(st.nextToken("."));
            }
        }
        return true;
    }

    public static void printIPRange(IPAdrStruct low, IPAdrStruct high) {
        for (short i = 0; i <= high.addr[0] - low.addr[0]; i++) {
            for (short j = 0; j <= high.addr[1] - low.addr[1]; j++) {
                for (short k = 0; k <= high.addr[2] - low.addr[2]; k++) {
                    for (short l = 1; l < high.addr[3] - low.addr[3]; l++) {
                        int m0 = low.addr[0] + i;
                        int m1 = low.addr[1] + j;
                        int m2 = low.addr[2] + k;
                        int m3 = low.addr[3] + l;
                                               

                        System.out.println(m0 + "." + m1 + "." + m2 + "." + m3);

                    }
                }
            }
        }

    }

}
