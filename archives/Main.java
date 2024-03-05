import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        System.out.println("Float.floatToRawIntBits(Float.NaN) = \t\t\t\t\t\t\t\t\t" + Integer.toBinaryString(Float.floatToRawIntBits(Float.NaN)));                                                                       // 0_11111111_1000000_00000000_00000000
        System.out.println("Float.floatToIntBits(Float.NaN) = \t\t\t\t\t\t\t\t\t\t" + Integer.toBinaryString(Float.floatToIntBits(Float.NaN)));                                                                           // 0_11111111_1000000_00000000_00000000
        System.out.println("Float.floatToIntBits(0b0_11111111_000_0000_0000_0000_0000_0001) = \t\t" + Integer.toBinaryString(Float.floatToIntBits(Float.intBitsToFloat(0b0_11111111_000_0000_0000_0000_0000_0001))));     // 0_11111111_1000000_00000000_00000000
        System.out.println("Float.floatToRawIntBits(0b0_11111111_000_0000_0000_0000_0000_0001) = \t" + Integer.toBinaryString(Float.floatToRawIntBits(Float.intBitsToFloat(0b0_11111111_000_0000_0000_0000_0000_0001)))); // 0_11111111_0000000_00000000_00000001
        System.out.println("6F = \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + Integer.toBinaryString(Float.floatToIntBits(6F)));                                // 0_10000001_10000000000000000000000
        System.out.printf("0F = \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%32s\n", Integer.toBinaryString(Float.floatToIntBits(0F)));                            //                                0
        System.out.printf("-0F = \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%32s\n" , Integer.toBinaryString(Float.floatToIntBits(-0F)));                         // 1_00000000_00000000000000000000000
        System.out.printf("Float.MIN_NORMAL = \t\t\t\t\t\t\t\t\t\t\t\t\t\t%32s\n" , Integer.toBinaryString(Float.floatToIntBits(Float.MIN_NORMAL)));           // 0_00000001_00000000000000000000000
        System.out.printf("Float.MAX_VALUE = \t\t\t\t\t\t\t\t\t\t\t\t\t\t%32s\n" , Integer.toBinaryString(Float.floatToIntBits(Float.MAX_VALUE)));             // 0_11111110_11111111111111111111111
        System.out.printf("Float.MIN_VALUE = \t\t\t\t\t\t\t\t\t\t\t\t\t\t%32s\n" , Integer.toBinaryString(Float.floatToIntBits(Float.MIN_VALUE)));             // 0b1 = 0b00000000_00000000_00000010 = 0x000002
        System.out.printf("Float.NEGATIVE_INFINITY = \t\t\t\t\t\t\t\t\t\t\t\t%32s\n" , Integer.toBinaryString(Float.floatToIntBits(Float.NEGATIVE_INFINITY))); // 1_11111111_00000000000000000000000
        System.out.printf("Float.POSITIVE_INFINITY = \t\t\t\t\t\t\t\t\t\t\t\t%32s\n" , Integer.toBinaryString(Float.floatToIntBits(Float.POSITIVE_INFINITY))); // 0_11111111_00000000000000000000000

        System.out.println("Charset.defaultCharset() = " + Charset.defaultCharset());
    }
}