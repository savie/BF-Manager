package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;
import java.io.PrintStream;
import java.io.UTFDataFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.۟ۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 058F */
/* JADX INFO: loaded from: classes3.dex */
public final class C7826 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f26066;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f26067;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f26068;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f26070;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f26071;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f26072;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f26073;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String[] f26074;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f26075;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f26076;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f26077;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f26078;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f26079;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f26081;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f26082;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f26083;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f26084;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f26085;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f26086;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f26087;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f26088;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f26089;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f26090;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f26091;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f26092;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f26093;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f26094;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C20528 f26069 = new C20528(C11138.f35105 * 3);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20528 f26080 = new C20528();

    public C7826(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        int i4;
        byteBuffer.position(0);
        ByteBuffer byteBufferOrder = byteBuffer.asReadOnlyBuffer().order(ByteOrder.BIG_ENDIAN);
        int i5 = byteBufferOrder.getInt() & (-256);
        if (i5 != 1684371456) {
            if (i5 == 1684371712) {
                throw new C16601("Odex unsupported.");
            }
            throw new C16601("Magic unsupported.");
        }
        int i6 = byteBufferOrder.getInt() >> 8;
        if (i6 < 3158837 || i6 > 3158848) {
            System.err.println("Unknown DEX version. Trying anyway...");
        }
        this.f26083 = i6;
        byteBufferOrder.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.position(byteBufferOrder.position() + 32);
        if (byteBufferOrder.getInt() != 305419896) {
            throw new C16601("Endian_tag unsupported");
        }
        byteBufferOrder.position(byteBufferOrder.position() + 8);
        int i7 = byteBufferOrder.getInt();
        int i8 = byteBufferOrder.getInt();
        this.f26066 = i8;
        int i9 = byteBufferOrder.getInt();
        this.f26067 = byteBufferOrder.getInt();
        int i10 = byteBufferOrder.getInt();
        this.f26070 = byteBufferOrder.getInt();
        int i11 = byteBufferOrder.getInt();
        this.f26092 = byteBufferOrder.getInt();
        int i12 = byteBufferOrder.getInt();
        this.f26073 = byteBufferOrder.getInt();
        int i13 = byteBufferOrder.getInt();
        this.f26068 = byteBufferOrder.getInt();
        int i14 = byteBufferOrder.getInt();
        this.f26074 = new String[i8];
        if (i6 >= 3158840) {
            byteBufferOrder.position(i7);
            int i15 = byteBufferOrder.getInt();
            int i16 = 0;
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            while (i16 < i15) {
                int i17 = byteBufferOrder.getShort() & HPKE.aead_EXPORT_ONLY;
                byteBufferOrder.getShort();
                int i18 = byteBufferOrder.getInt();
                int i19 = byteBufferOrder.getInt();
                int i20 = i15;
                if (i17 == 7) {
                    i4 = i18;
                    i3 = i19;
                } else if (i17 == 8) {
                    i2 = i18;
                    i = i19;
                }
                i16++;
                i15 = i20;
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        this.f26081 = i4;
        this.f26085 = m21315(byteBufferOrder, i9, this.f26066 * 4);
        this.f26086 = m21315(byteBufferOrder, i10, this.f26067 * 4);
        this.f26093 = m21315(byteBufferOrder, i11, this.f26070 * 12);
        this.f26082 = m21315(byteBufferOrder, i12, this.f26092 * 8);
        this.f26088 = m21315(byteBufferOrder, i13, this.f26073 * 8);
        this.f26072 = m21315(byteBufferOrder, i14, this.f26068 * 32);
        this.f26087 = m21315(byteBufferOrder, i3, i4 * 4);
        this.f26078 = m21315(byteBufferOrder, i, i2 * 8);
        byteBufferOrder.position(0);
        ByteBuffer byteBufferDuplicate = byteBufferOrder.duplicate();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f26091 = byteBufferDuplicate.order(byteOrder);
        this.f26090 = byteBufferOrder.duplicate().order(byteOrder);
        this.f26071 = byteBufferOrder.duplicate().order(byteOrder);
        this.f26076 = byteBufferOrder.duplicate().order(byteOrder);
        this.f26079 = byteBufferOrder.duplicate().order(byteOrder);
        this.f26077 = byteBufferOrder.duplicate().order(byteOrder);
        this.f26089 = byteBufferOrder.duplicate().order(byteOrder);
        this.f26084 = byteBufferOrder.duplicate().order(byteOrder);
        this.f26075 = byteBufferOrder.duplicate().order(byteOrder);
        this.f26094 = byteBufferOrder.duplicate().order(byteOrder);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m21315(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.position(i);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit(i2);
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferSlice;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21318(int i, Throwable th) {
        int i2;
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (true) {
            i2 = i + 1;
            if (i3 >= i2) {
                break;
            }
            sb.append(".");
            i3++;
        }
        sb.append(' ');
        if (th instanceof C16601) {
            sb.append(th.getMessage());
            System.err.println(sb);
            if (th.getCause() != null) {
                m21318(i2, th.getCause());
                return;
            }
            return;
        }
        if (th != null) {
            PrintStream printStream = System.err;
            sb.append("ROOT cause:");
            printStream.println(sb);
            th.printStackTrace(System.err);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m21334(ByteBuffer byteBuffer, int i) {
        int i2 = ((i >> 5) & 7) + 1;
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= ((long) (byteBuffer.get() & 255)) << (i3 * 8);
        }
        int i4 = (8 - i2) * 8;
        return (j << i4) >> i4;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static long m21327(ByteBuffer byteBuffer, int i) {
        int i2 = ((i >> 5) & 7) + 1;
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= ((long) (byteBuffer.get() & 255)) << (i3 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m21313(ByteBuffer byteBuffer, int i) {
        int i2 = ((i >> 5) & 7) + 1;
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= ((long) (byteBuffer.get() & 255)) << (i3 * 8);
        }
        return j << ((int) (((long) (8 - i2)) * 8));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m21332(int i, byte[] bArr) {
        return (bArr[i] & 255) | (bArr[i + 1] << 8);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m21325(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m21310(int i, byte[] bArr) {
        return (bArr[i] & 255) | (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21320(String str, Object... objArr) {
        System.err.printf(str.concat("%n"), objArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21321(TreeMap treeMap, int i) {
        if (treeMap.containsKey(Integer.valueOf(i))) {
            return;
        }
        treeMap.put(Integer.valueOf(i), new C17347(i));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m21326(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        int i = 0;
        int i2 = 0;
        while ((b & GCMSIVBlockCipher.MASK) != 0) {
            i |= (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << i2;
            i2 += 7;
            b = byteBuffer.get();
        }
        return ((b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << i2) | i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m21333(ByteBuffer byteBuffer) {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte b = byteBuffer.get();
            i2 |= (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << i3;
            i = i3 + 7;
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                break;
            }
            i3 = i;
        }
        long j = i2;
        return ((1 << (i3 + 6)) & j) != 0 ? (int) (j - (1 << i)) : i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21317(int i, int i2, boolean z, C3177 c3177, TreeMap treeMap, C6118 c6118) {
        ByteBuffer byteBuffer = this.f26094;
        byteBuffer.position(i);
        int iM21326 = m21326(byteBuffer);
        int iM21327 = m21326(byteBuffer);
        C18267[] c18267Arr = new C18267[i2];
        int i3 = 0;
        for (String str : c3177.m10375()) {
            i3 = (str.equals("J") || str.equals("D")) ? i3 + 2 : i3 + 1;
        }
        int i4 = i2 - i3;
        if (!z) {
            c18267Arr[i4 - 1] = new C18267();
        }
        String[] strArrM10375 = c3177.m10375();
        for (int i5 = 0; i5 < iM21327; i5++) {
            String str2 = strArrM10375[i5];
            String strM21330 = m21330(m21326(byteBuffer) - 1);
            c18267Arr[i4] = new C18267();
            if (strM21330 != null) {
                c6118.mo17656(i5, strM21330);
            }
            i4 = (str2.equals("J") || str2.equals("D")) ? i4 + 2 : i4 + 1;
        }
        int iM21328 = 0;
        while (true) {
            int i6 = iM21326;
            while (true) {
                int i7 = byteBuffer.get() & 255;
                switch (i7) {
                    case 0:
                        return;
                    case 1:
                        iM21328 = m21326(byteBuffer) + iM21328;
                        break;
                    case 2:
                        break;
                    case 3:
                        int iM21329 = m21326(byteBuffer);
                        int iM213210 = m21326(byteBuffer) - 1;
                        int iM213211 = m21326(byteBuffer) - 1;
                        String strM21331 = m21330(iM213210);
                        String strM21329 = m21329(iM213211);
                        c18267Arr[iM21329] = new C18267();
                        m21321(treeMap, iM21328);
                        c6118.mo17658(iM21329, (C17347) treeMap.get(Integer.valueOf(iM21328)), strM21331, strM21329, null);
                        break;
                    case 4:
                        int iM213212 = m21326(byteBuffer);
                        int iM213213 = m21326(byteBuffer) - 1;
                        int iM213214 = m21326(byteBuffer) - 1;
                        int iM213215 = m21326(byteBuffer) - 1;
                        String strM21332 = m21330(iM213213);
                        String strM213210 = m21329(iM213214);
                        String strM21333 = m21330(iM213215);
                        C18267 c18267 = new C18267();
                        m21321(treeMap, iM21328);
                        c6118.mo17658(iM213212, (C17347) treeMap.get(Integer.valueOf(iM21328)), strM21332, strM213210, strM21333);
                        c18267Arr[iM213212] = c18267;
                        break;
                    case 5:
                        int iM213216 = m21326(byteBuffer);
                        if (c18267Arr[iM213216] == null) {
                            throw new RuntimeException(C13645.m33382(iM213216, "Encountered RESTART_LOCAL on new v"));
                        }
                        m21321(treeMap, iM21328);
                        c6118.mo17657(iM213216, (C17347) treeMap.get(Integer.valueOf(iM21328)));
                        break;
                        break;
                    case 6:
                        int iM213217 = m21326(byteBuffer);
                        if (c18267Arr[iM213217] == null) {
                            throw new RuntimeException(C13645.m33382(iM213217, "Encountered RESTART_LOCAL on new v"));
                        }
                        m21321(treeMap, iM21328);
                        c6118.mo17660(iM213217, (C17347) treeMap.get(Integer.valueOf(iM21328)));
                        break;
                        break;
                    case 7:
                        m21321(treeMap, iM21328);
                        c6118.mo17662((C17347) treeMap.get(Integer.valueOf(iM21328)));
                        break;
                    case 8:
                        m21321(treeMap, iM21328);
                        c6118.mo17659((C17347) treeMap.get(Integer.valueOf(iM21328)));
                        break;
                    case 9:
                        break;
                    default:
                        if (i7 < 10) {
                            throw new RuntimeException(C13645.m33382(i7, "Invalid extended opcode encountered "));
                        }
                        int i8 = i7 - 10;
                        int i9 = (i8 / 15) + iM21328;
                        int i10 = ((i8 % 15) - 4) + i6;
                        m21321(treeMap, i9);
                        c6118.mo17661(i10, (C17347) treeMap.get(Integer.valueOf(i9)));
                        i6 = i10;
                        iM21328 = i9;
                        break;
                        break;
                }
            }
            iM21326 = m21333(byteBuffer) + i6;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m21342() {
        return this.f26083;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21340(C8571 c8571, int i) {
        c8571.mo23023(this.f26083);
        int i2 = this.f26068;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBuffer = this.f26072;
            byteBuffer.position(i3 * 32);
            arrayList.add(new C0368(m21329(byteBuffer.getInt()), i3));
        }
        Collections.sort(arrayList);
        for (int i4 = 0; i4 < i2; i4++) {
            m21341(c8571, ((C0368) arrayList.get(i4)).f1889, i);
        }
        c8571.mo23022();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21341(C8571 c8571, int i, int i2) {
        ByteBuffer byteBuffer = this.f26072;
        byteBuffer.position(i * 32);
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        int i6 = byteBuffer.getInt();
        int i7 = byteBuffer.getInt();
        int i8 = byteBuffer.getInt();
        int i9 = byteBuffer.getInt();
        int i10 = byteBuffer.getInt();
        String strM21329 = m21329(i3);
        try {
            C6664 c6664Mo23021 = c8571.mo23021(strM21329, m21329(i5), m21324(i6), i4);
            if (c6664Mo23021 != null) {
                m21323(c6664Mo23021, i7, i8, i9, i10, i2);
            }
        } catch (Exception e) {
            C16601 c16601 = new C16601(e, "Error process class: [%d]%s", Integer.valueOf(i3), strM21329);
            if ((i2 & 32) != 0) {
                m21318(0, c16601);
                return;
            }
            throw c16601;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m21314(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        int i = b & 255;
        boolean z = b & bo.j;
        if (z == 0) {
            return Byte.valueOf((byte) m21334(byteBuffer, i));
        }
        if (z == 6) {
            return Long.valueOf(m21334(byteBuffer, i));
        }
        if (z == 2) {
            return Short.valueOf((short) m21334(byteBuffer, i));
        }
        if (z == 3) {
            return Character.valueOf((char) m21327(byteBuffer, i));
        }
        if (z == 4) {
            return Integer.valueOf((int) m21334(byteBuffer, i));
        }
        if (z == 16) {
            return Float.valueOf(Float.intBitsToFloat((int) (m21313(byteBuffer, i) >> 32)));
        }
        if (z == 17) {
            return Double.valueOf(Double.longBitsToDouble(m21313(byteBuffer, i)));
        }
        switch (z ? 1 : 0) {
            case 21:
                return m21331((int) m21327(byteBuffer, i));
            case 22:
                return m21337((int) m21327(byteBuffer, i));
            case 23:
                return m21330((int) m21327(byteBuffer, i));
            case 24:
                return new C15855(m21329((int) m21327(byteBuffer, i)));
            case 25:
                return m21335((int) m21327(byteBuffer, i));
            case 26:
                return m21328((int) m21327(byteBuffer, i));
            case 27:
                return m21335((int) m21327(byteBuffer, i));
            case 28:
                int iM21326 = m21326(byteBuffer);
                Object[] objArr = new Object[iM21326];
                for (int i2 = 0; i2 < iM21326; i2++) {
                    objArr[i2] = m21314(byteBuffer);
                }
                return objArr;
            case 29:
                return m21336(byteBuffer);
            case 30:
                return null;
            case 31:
                return Boolean.valueOf(((i >> 5) & 3) != 0);
            default:
                throw new C16601("Not support yet.");
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private C20331 m21337(int i) {
        ByteBuffer byteBuffer = this.f26078;
        byteBuffer.position(i * 8);
        int i2 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        byteBuffer.getShort();
        int i3 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
                return new C20331(i2, m21335(i3));
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return new C20331(i2, m21328(i3));
            default:
                throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21323(C6664 c6664, int i, int i2, int i3, int i4, int i5) {
        Map map;
        Map map2;
        Map map3;
        Object[] objArr;
        if ((i5 & 1) == 0 && i != -1) {
            c6664.f22224 = m21330(i);
        }
        int i6 = i5 & 8;
        C20528 c20528 = this.f26069;
        if (i6 == 0) {
            map = (Map) c20528.m47061();
            map2 = (Map) c20528.m47061();
            map3 = (Map) c20528.m47061();
            if (map == null) {
                map = new HashMap();
            }
            if (map2 == null) {
                map2 = new HashMap();
            }
            if (map3 == null) {
                map3 = new HashMap();
            }
            if (i2 != 0) {
                ByteBuffer byteBuffer = this.f26091;
                byteBuffer.position(i2);
                int i7 = byteBuffer.getInt();
                int i8 = byteBuffer.getInt();
                int i9 = byteBuffer.getInt();
                int i10 = byteBuffer.getInt();
                for (int i11 = 0; i11 < i8; i11++) {
                    map.put(Integer.valueOf(byteBuffer.getInt()), Integer.valueOf(byteBuffer.getInt()));
                }
                for (int i12 = 0; i12 < i9; i12++) {
                    map2.put(Integer.valueOf(byteBuffer.getInt()), Integer.valueOf(byteBuffer.getInt()));
                }
                for (int i13 = 0; i13 < i10; i13++) {
                    map3.put(Integer.valueOf(byteBuffer.getInt()), Integer.valueOf(byteBuffer.getInt()));
                }
                if (i7 != 0) {
                    try {
                        m21319(i7, c6664);
                    } catch (Exception e) {
                        throw new C16601("error on reading Annotation of class ", e);
                    }
                }
            }
        } else {
            map = null;
            map2 = null;
            map3 = null;
        }
        Map map4 = map;
        Map map5 = map2;
        Map map6 = map3;
        if (i3 != 0) {
            ByteBuffer byteBuffer2 = this.f26079;
            byteBuffer2.position(i3);
            int iM21326 = m21326(byteBuffer2);
            int iM21327 = m21326(byteBuffer2);
            int iM21328 = m21326(byteBuffer2);
            int iM21329 = m21326(byteBuffer2);
            if ((i5 & 16) != 0 || i4 == 0) {
                objArr = null;
            } else {
                ByteBuffer byteBuffer3 = this.f26084;
                byteBuffer3.position(i4);
                int iM213210 = m21326(byteBuffer3);
                objArr = new Object[iM213210];
                for (int i14 = 0; i14 < iM213210; i14++) {
                    objArr[i14] = m21314(byteBuffer3);
                }
            }
            Object[] objArr2 = objArr;
            int iM21311 = 0;
            int i15 = 0;
            while (i15 < iM21326) {
                iM21311 = m21311(byteBuffer2, iM21311, c6664, map4, (objArr2 == null || i15 >= objArr2.length) ? null : objArr2[i15], i5);
                i15++;
                iM21329 = iM21329;
                iM21328 = iM21328;
                objArr2 = objArr2;
            }
            int i16 = iM21329;
            int i17 = iM21328;
            int iM21312 = 0;
            for (int i18 = 0; i18 < iM21327; i18++) {
                iM21312 = m21311(byteBuffer2, iM21312, c6664, map4, (Object) null, i5);
            }
            int iM21313 = 0;
            boolean z = true;
            int i19 = 0;
            while (i19 < i17) {
                iM21313 = m21312(byteBuffer2, iM21313, c6664, map5, map6, i5, z);
                i19++;
                z = false;
            }
            int iM21314 = 0;
            boolean z2 = true;
            int i20 = 0;
            while (i20 < i16) {
                iM21314 = m21312(byteBuffer2, iM21314, c6664, map5, map6, i5, z2);
                i20++;
                z2 = false;
            }
        }
        if (map4 != null) {
            map4.clear();
            c20528.m47060(map4);
        }
        if (map5 != null) {
            map5.clear();
            c20528.m47060(map5);
        }
        if (map6 != null) {
            map6.clear();
            c20528.m47060(map6);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21319(int i, InterfaceC2605 interfaceC2605) {
        ByteBuffer byteBuffer = this.f26090;
        byteBuffer.position(i);
        int i2 = byteBuffer.getInt();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = byteBuffer.getInt();
            ByteBuffer byteBuffer2 = this.f26071;
            byteBuffer2.position(i4);
            int i5 = byteBuffer2.get() & 255;
            C12629 c12629M21336 = m21336(byteBuffer2);
            EnumC6161 enumC6161 = EnumC6161.values()[i5];
            c12629M21336.f40536 = enumC6161;
            C12629 c12629Mo5195 = interfaceC2605.mo5195(c12629M21336.f40537, enumC6161);
            for (C20834 c20834 : c12629M21336.f40535) {
                C12629.m31395(c12629Mo5195, c20834.f66712, c20834.f66713);
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private C12629 m21336(ByteBuffer byteBuffer) {
        int iM21326 = m21326(byteBuffer);
        int iM21327 = m21326(byteBuffer);
        C12629 c12629 = new C12629(m21329(iM21326), EnumC6161.RUNTIME);
        for (int i = 0; i < iM21327; i++) {
            c12629.f40535.add(new C20834(m21330(m21326(byteBuffer)), m21314(byteBuffer)));
        }
        return c12629;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C23315 m21335(int i) {
        ByteBuffer byteBuffer = this.f26082;
        byteBuffer.position(i * 8);
        int i2 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        int i3 = 65535 & byteBuffer.getShort();
        return new C23315(m21329(i2), m21330(byteBuffer.getInt()), m21329(i3));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private String[] m21324(int i) {
        if (i == 0) {
            return new String[0];
        }
        ByteBuffer byteBuffer = this.f26075;
        byteBuffer.position(i);
        int i2 = byteBuffer.getInt();
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = m21329(65535 & byteBuffer.getShort());
        }
        return strArr;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private C12126 m21331(int i) {
        ByteBuffer byteBuffer = this.f26093;
        byteBuffer.position((i * 12) + 4);
        return new C12126(m21329(byteBuffer.getInt()), m21324(byteBuffer.getInt()));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C3177 m21328(int i) {
        ByteBuffer byteBuffer = this.f26088;
        byteBuffer.position(i * 8);
        int i2 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        int i3 = 65535 & byteBuffer.getShort();
        return new C3177(m21329(i2), m21330(byteBuffer.getInt()), m21331(i3));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private String m21330(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this.f26074;
        if (i >= strArr.length) {
            return null;
        }
        String str = strArr[i];
        if (str != null) {
            return str;
        }
        C20528 c20528 = this.f26080;
        int i2 = this.f26085.getInt(i * 4);
        ByteBuffer byteBuffer = this.f26089;
        byteBuffer.position(i2);
        int iM21326 = m21326(byteBuffer);
        try {
            StringBuilder sb = (StringBuilder) c20528.m47061();
            if (sb == null) {
                sb = new StringBuilder((int) (((double) iM21326) * 1.5d));
            }
            String strM24553 = C9316.m24553(byteBuffer, sb);
            if (sb.length() < 100) {
                sb.setLength(0);
                c20528.m47060(sb);
            }
            strArr[i] = strM24553;
            return strM24553;
        } catch (UTFDataFormatException e) {
            throw new C16601(e, "fail to load string %d@%08x", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private String m21329(int i) {
        if (i == -1) {
            return null;
        }
        return m21330(this.f26086.getInt(i * 4));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m21311(ByteBuffer byteBuffer, int i, C6664 c6664, Map map, Object obj, int i2) {
        Integer num;
        int iM21326 = m21326(byteBuffer);
        int iM21327 = m21326(byteBuffer);
        int i3 = i + iM21326;
        C23315 c23315M21335 = m21335(i3);
        if (c6664.f22228 == null) {
            c6664.f22228 = new ArrayList();
        }
        C1443 c1443 = new C1443();
        c1443.f5057 = iM21327;
        c1443.f5060 = c23315M21335;
        c1443.f5058 = obj;
        c6664.f22228.add(c1443);
        if ((i2 & 8) != 0 || (num = (Integer) map.get(Integer.valueOf(i3))) == null) {
            return i3;
        }
        try {
            m21319(num.intValue(), c1443);
            return i3;
        } catch (Exception e) {
            throw new C16601(e, "while accept annotation in field:%s.", c23315M21335.toString());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m21312(ByteBuffer byteBuffer, int i, C6664 c6664, Map map, Map map2, int i2, boolean z) {
        InterfaceC2605 interfaceC2605M23812;
        int iPosition = byteBuffer.position();
        int iM21326 = m21326(byteBuffer);
        int iM21327 = m21326(byteBuffer);
        int iM21328 = m21326(byteBuffer);
        int i3 = i + iM21326;
        C3177 c3177M21328 = m21328(i3);
        if (!z && iM21326 == 0) {
            m21320("GLITCH: duplicated method %s @%08x", c3177M21328.toString(), Integer.valueOf(iPosition));
            if ((i2 & 64) == 0) {
                m21320("WARN: skip method %s @%08x", c3177M21328.toString(), Integer.valueOf(iPosition));
                return i3;
            }
        }
        if ((65536 & iM21327) == 0 && (c3177M21328.m10374().equals("<init>") || c3177M21328.m10374().equals("<clinit>"))) {
            m21320("GLITCH: method %s @%08x not marked as ACC_CONSTRUCTOR", c3177M21328.toString(), Integer.valueOf(iPosition));
        }
        try {
            if (c6664.f22225 == null) {
                c6664.f22225 = new ArrayList();
            }
            C8900 c8900 = new C8900();
            c8900.f29080 = iM21327;
            c8900.f29084 = c3177M21328;
            c6664.f22225.add(c8900);
            if ((i2 & 8) == 0) {
                Integer num = (Integer) map.get(Integer.valueOf(i3));
                if (num != null) {
                    try {
                        m21319(num.intValue(), c8900);
                    } catch (Exception e) {
                        throw new C16601(e, "while accept annotation in method:%s.", c3177M21328.toString());
                    }
                }
                Integer num2 = (Integer) map2.get(Integer.valueOf(i3));
                if (num2 != null) {
                    try {
                        int iIntValue = num2.intValue();
                        ByteBuffer byteBuffer2 = this.f26076;
                        byteBuffer2.position(iIntValue);
                        int i4 = byteBuffer2.getInt();
                        for (int i5 = 0; i5 < i4; i5++) {
                            int i6 = byteBuffer2.getInt();
                            if (i6 != 0 && (interfaceC2605M23812 = c8900.m23812(i5)) != null) {
                                try {
                                    m21319(i6, interfaceC2605M23812);
                                } catch (Exception e2) {
                                    throw new C16601(e2, "While accepting parameter annotation in parameter: [%d]", Integer.valueOf(i5));
                                }
                            }
                        }
                    } catch (Exception e3) {
                        throw new C16601(e3, "while accept parameter annotation in method:%s.", c3177M21328.toString());
                    }
                }
            }
            if (iM21328 == 0 || ((i2 & 4) != 0 && ((i2 & 128) == 0 || !c3177M21328.m10374().equals("<clinit>")))) {
                return i3;
            }
            C24564 c24564 = new C24564();
            c24564.f79619 = new ArrayList();
            c24564.f79620 = null;
            c24564.f79618 = -1;
            c8900.f29081 = c24564;
            try {
                m21339(iM21328, c24564, i2, (iM21327 & 8) != 0, c3177M21328);
                return i3;
            } catch (Exception e4) {
                throw new C16601(e4, "while accept code in method:[%s] @%08x", c3177M21328.toString(), Integer.valueOf(iM21328));
            }
        } catch (Exception e5) {
            throw new C16601(e5, "while accept method:[%s]", c3177M21328.toString());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m21338() {
        return this.f26068;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:109:0x0220 A[PHI: r1
      0x0220: PHI (r1v46 int) = (r1v34 int), (r1v38 int), (r1v40 int), (r1v42 int), (r1v44 int), (r1v48 int) binds: [B:108:0x021e, B:100:0x0204, B:97:0x01f9, B:94:0x01f0, B:91:0x01e5, B:88:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x0222 A[PHI: r1
      0x0222: PHI (r1v45 int) = (r1v34 int), (r1v34 int), (r1v38 int), (r1v40 int), (r1v42 int), (r1v44 int), (r1v48 int), (r1v48 int) binds: [B:106:0x021a, B:108:0x021e, B:100:0x0204, B:97:0x01f9, B:94:0x01f0, B:91:0x01e5, B:86:0x01d6, B:88:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ff  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21322(TreeMap treeMap, LinkedList linkedList, byte[] bArr, int i) {
        boolean z;
        char c;
        int iM21325;
        boolean z2;
        int i2 = i * 2;
        if (i2 >= bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = bArr[i2] & 255;
        EnumC1114 enumC1114 = EnumC1114.f3970[i3];
        if (enumC1114 == null || enumC1114.f4168 == null) {
            throw new C21251("zero-width instruction op=0x%02x", Integer.valueOf(i3));
        }
        if (enumC1114.m4132()) {
            switch (C14537.f45734[enumC1114.f4168.ordinal()]) {
                case 1:
                    int i4 = i + bArr[i2 + 1];
                    if (i4 < 0 || i4 * 2 > bArr.length) {
                        throw new C21251("jump out of insns %s -> %04x", enumC1114, Integer.valueOf(i4));
                    }
                    linkedList.add(Integer.valueOf(i4));
                    m21321(treeMap, i4);
                    z = true;
                    break;
                    break;
                case 2:
                case 3:
                    int iM21332 = i + m21332(i2 + 2, bArr);
                    if (iM21332 < 0 || iM21332 * 2 > bArr.length) {
                        throw new C21251("jump out of insns %s -> %04x", enumC1114, Integer.valueOf(iM21332));
                    }
                    linkedList.add(Integer.valueOf(iM21332));
                    m21321(treeMap, iM21332);
                    z = true;
                    break;
                    break;
                case 4:
                    int iM21333 = i + m21332(i2 + 2, bArr);
                    byte b = bArr[i2 + 1];
                    if ((b & 15) == (((b & 255) >> 4) & 15)) {
                        switch (C14537.f45735[enumC1114.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                                z2 = false;
                                z = false;
                                break;
                            case 4:
                            case 5:
                            case 6:
                                z2 = true;
                                z = true;
                                break;
                            default:
                                z2 = false;
                                z = true;
                                break;
                        }
                    } else {
                        z2 = false;
                        z = true;
                    }
                    if (!z2) {
                        if (iM21333 < 0 || iM21333 * 2 > bArr.length) {
                            throw new C21251("jump out of insns %s -> %04x", enumC1114, Integer.valueOf(iM21333));
                        }
                        linkedList.add(Integer.valueOf(iM21333));
                        m21321(treeMap, iM21333);
                    }
                    break;
                case 5:
                case 6:
                    int iM21310 = i + m21310(i2 + 2, bArr);
                    if (iM21310 < 0 || iM21310 * 2 > bArr.length) {
                        throw new C21251("jump out of insns %s -> %04x", enumC1114, Integer.valueOf(iM21310));
                    }
                    linkedList.add(Integer.valueOf(iM21310));
                    m21321(treeMap, iM21310);
                    z = true;
                    break;
                    break;
                default:
                    z = true;
                    break;
            }
        } else {
            z = true;
        }
        if (enumC1114.m4133()) {
            m21321(treeMap, i + enumC1114.f4168.f61610);
            int iM21311 = (i + m21310(i2 + 2, bArr)) * 2;
            int i5 = iM21311 + 2;
            if (i5 < bArr.length) {
                byte b2 = bArr[iM21311 + 1];
                if (b2 == 1) {
                    c = 0;
                    int iM21326 = m21325(i5, bArr);
                    int i6 = iM21311 + 8;
                    for (int i7 = 0; i7 < iM21326; i7++) {
                        int iM21312 = i + m21310((i7 * 4) + i6, bArr);
                        if (iM21312 < 0 || iM21312 * 2 > bArr.length) {
                            throw new C21251("jump out of insns %s -> %04x", enumC1114, Integer.valueOf(iM21312));
                        }
                        linkedList.add(Integer.valueOf(iM21312));
                        m21321(treeMap, iM21312);
                    }
                } else if (b2 == 2) {
                    int iM21327 = m21325(i5, bArr);
                    int i8 = (iM21327 * 4) + iM21311 + 4;
                    for (int i9 = 0; i9 < iM21327; i9++) {
                        int iM21313 = i + m21310((i9 * 4) + i8, bArr);
                        if (iM21313 < 0 || iM21313 * 2 > bArr.length) {
                            throw new C21251("jump out of insns %s -> %04x", enumC1114, Integer.valueOf(iM21313));
                        }
                        linkedList.add(Integer.valueOf(iM21313));
                        m21321(treeMap, iM21313);
                    }
                    c = 0;
                } else {
                    throw new C21251("bad payload for %s", enumC1114);
                }
            } else {
                throw new C21251("bad payload offset for %s", enumC1114);
            }
        } else {
            c = 0;
        }
        if (z) {
            int i10 = C14537.f45736[enumC1114.f4169.ordinal()];
            int i11 = this.f26073;
            switch (i10) {
                case 1:
                    if (enumC1114.f4168 == EnumC19013.kFmt31c) {
                        iM21325 = m21310(i2 + 2, bArr);
                    } else {
                        iM21325 = m21325(i2 + 2, bArr);
                    }
                    if (iM21325 < 0 || iM21325 >= this.f26066) {
                        z = false;
                    } else {
                        z = true;
                    }
                    break;
                case 2:
                    iM21325 = m21325(i2 + 2, bArr);
                    if (iM21325 < this.f26067) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 3:
                    iM21325 = m21325(i2 + 2, bArr);
                    if (iM21325 < i11) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 4:
                    iM21325 = m21325(i2 + 2, bArr);
                    if (iM21325 < this.f26092) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 5:
                    iM21325 = m21325(i2 + 2, bArr);
                    if (iM21325 < this.f26081) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 6:
                    iM21325 = m21325(i2 + 2, bArr);
                    int iM21328 = m21325(i2 + 6, bArr);
                    if (iM21325 >= i11 || iM21328 >= this.f26070) {
                        z = false;
                    } else {
                        z = true;
                    }
                    break;
                default:
                    iM21325 = Integer.MAX_VALUE;
                    break;
            }
            if (!z) {
                Integer numValueOf = Integer.valueOf(iM21325);
                Object[] objArr = new Object[2];
                objArr[c] = enumC1114;
                objArr[1] = numValueOf;
                throw new C21251("index-out-of-range for %s index: %d", objArr);
            }
        }
        if (z && enumC1114.m4135()) {
            EnumC1114 enumC1115 = EnumC1114.f4100;
            if (enumC1114 == enumC1115) {
                byte b3 = bArr[i2 + 1];
                if (b3 == 0) {
                    linkedList.add(Integer.valueOf(i + enumC1115.f4168.f61610));
                    return;
                }
                if (b3 == 1) {
                    linkedList.add(Integer.valueOf((m21325(i2 + 2, bArr) * 2) + i + 4));
                    return;
                } else if (b3 == 2) {
                    linkedList.add(Integer.valueOf((m21325(i2 + 2, bArr) * 4) + i + 2));
                    return;
                } else {
                    if (b3 != 3) {
                        return;
                    }
                    linkedList.add(Integer.valueOf((((m21310(i2 + 4, bArr) * m21325(i2 + 2, bArr)) + 1) / 2) + i + 4));
                    return;
                }
            }
            linkedList.add(Integer.valueOf(i + enumC1114.f4168.f61610));
        }
    }

    /* JADX WARN: Code duplicated, block: B:218:0x079a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21339(int i, C24564 c24564, int i2, boolean z, C3177 c3177) {
        BitSet bitSet;
        Integer num;
        EnumC1114[] enumC1114Arr;
        int i3;
        BitSet bitSet2;
        boolean z2;
        int i4;
        int i5;
        int i6;
        BitSet bitSet3;
        ByteBuffer byteBuffer = this.f26077;
        byteBuffer.position(i);
        int i7 = byteBuffer.getShort() & 65535;
        byteBuffer.getShort();
        byteBuffer.getShort();
        int i8 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        int i9 = byteBuffer.getInt();
        int i10 = byteBuffer.getInt();
        byte[] bArr = new byte[i10 * 2];
        byteBuffer.get(bArr);
        c24564.f79618 = i7;
        BitSet bitSet4 = new BitSet();
        TreeMap treeMap = new TreeMap();
        HashSet hashSet = new HashSet();
        if (i8 > 0) {
            if ((i10 & 1) != 0) {
                byteBuffer.getShort();
            }
            short s = HPKE.aead_EXPORT_ONLY;
            if ((i2 & 256) == 0) {
                int iPosition = (i8 * 8) + byteBuffer.position();
                ByteBuffer byteBufferOrder = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
                int i11 = 0;
                while (i11 < i8) {
                    int i12 = i8;
                    int i13 = byteBuffer.getInt();
                    int i14 = byteBuffer.getShort() & s;
                    int i15 = byteBuffer.getShort() & s;
                    if (i13 > i10) {
                        i6 = i7;
                        i4 = i10;
                        bitSet3 = bitSet4;
                    } else {
                        m21321(treeMap, i13);
                        int i16 = i13 + i14;
                        m21321(treeMap, i16);
                        byteBufferOrder.position(iPosition + i15);
                        int iM21333 = m21333(byteBufferOrder);
                        if (iM21333 <= 0) {
                            int i17 = -iM21333;
                            z2 = true;
                            int i18 = i10;
                            i5 = i17;
                            iM21333 = i17 + 1;
                            i4 = i18;
                        } else {
                            z2 = false;
                            i4 = i10;
                            i5 = iM21333;
                        }
                        C17347[] c17347Arr = new C17347[iM21333];
                        String[] strArr = new String[iM21333];
                        int i19 = 0;
                        while (i19 < i5) {
                            BitSet bitSet5 = bitSet4;
                            int iM21326 = m21326(byteBufferOrder);
                            int i20 = i7;
                            int iM21327 = m21326(byteBufferOrder);
                            m21321(treeMap, iM21327);
                            hashSet.add(Integer.valueOf(iM21327));
                            strArr[i19] = m21329(iM21326);
                            c17347Arr[i19] = (C17347) treeMap.get(Integer.valueOf(iM21327));
                            i19++;
                            bitSet4 = bitSet5;
                            i7 = i20;
                        }
                        i6 = i7;
                        bitSet3 = bitSet4;
                        if (z2) {
                            int iM21328 = m21326(byteBufferOrder);
                            m21321(treeMap, iM21328);
                            hashSet.add(Integer.valueOf(iM21328));
                            c17347Arr[i5] = (C17347) treeMap.get(Integer.valueOf(iM21328));
                        }
                        C17347 c17347 = (C17347) treeMap.get(Integer.valueOf(i13));
                        C17347 c17348 = (C17347) treeMap.get(Integer.valueOf(i16));
                        if (c24564.f79620 == null) {
                            c24564.f79620 = new ArrayList(3);
                        }
                        c24564.f79620.add(new C7409(c17347, c17348, c17347Arr, strArr));
                    }
                    i11++;
                    i8 = i12;
                    byteBuffer = byteBuffer;
                    i10 = i4;
                    iPosition = iPosition;
                    bitSet4 = bitSet3;
                    bArr = bArr;
                    i7 = i6;
                    s = HPKE.aead_EXPORT_ONLY;
                }
            }
        }
        int i21 = i7;
        byte[] bArr2 = bArr;
        BitSet bitSet6 = bitSet4;
        if (i9 != 0 && (i2 & 1) == 0) {
            c24564.getClass();
            C10391 c10391 = new C10391();
            c10391.f33037 = new ArrayList();
            c24564.f79617 = c10391;
            try {
                m21317(i9, i21, z, c3177, treeMap, c10391);
            } catch (Exception unused) {
            }
        }
        BitSet bitSet7 = new BitSet();
        LinkedList linkedList = new LinkedList();
        linkedList.add(0);
        linkedList.addAll(hashSet);
        hashSet.clear();
        while (!linkedList.isEmpty()) {
            Integer num2 = (Integer) linkedList.poll();
            int iIntValue = num2.intValue();
            bitSet6 = bitSet6;
            if (!bitSet6.get(iIntValue)) {
                bitSet6.set(iIntValue);
                byte[] bArr3 = bArr2;
                try {
                    m21322(treeMap, linkedList, bArr3, iIntValue);
                } catch (IndexOutOfBoundsException unused2) {
                    bitSet7.set(iIntValue);
                    m21320("GLITCH: %04x %s | not enough space for reading instruction", num2, c3177.toString());
                } catch (C21251 e) {
                    bitSet7.set(iIntValue);
                    m21320("GLITCH: %04x %s | %s", num2, c3177.toString(), e.getMessage());
                }
                bArr2 = bArr3;
            }
        }
        BitSet bitSet8 = bitSet6;
        byte[] bArr4 = bArr2;
        Iterator it = treeMap.keySet().iterator();
        Integer num3 = it.hasNext() ? (Integer) it.next() : null;
        EnumC1114[] enumC1114Arr2 = EnumC1114.f3970;
        int iNextSetBit = bitSet8.nextSetBit(0);
        while (iNextSetBit >= 0) {
            while (num3 != null && num3.intValue() <= iNextSetBit) {
                c24564.m54868((C17347) treeMap.get(num3));
                num3 = it.hasNext() ? (Integer) it.next() : null;
            }
            if (bitSet7.get(iNextSetBit)) {
                c24564.m54854(EnumC1114.f4008);
            } else {
                int i22 = iNextSetBit * 2;
                EnumC1114 enumC1114 = enumC1114Arr2[bArr4[i22] & 255];
                switch (C14537.f45734[enumC1114.f4168.ordinal()]) {
                    case 1:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC1114Arr = enumC1114Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        c24564.m54859(enumC1114, -1, -1, (C17347) treeMap.get(Integer.valueOf(bArr4[i22 + 1] + i3)));
                        break;
                    case 2:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC1114Arr = enumC1114Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        c24564.m54859(enumC1114, -1, -1, (C17347) treeMap.get(Integer.valueOf(m21332(i22 + 2, bArr4) + i3)));
                        break;
                    case 3:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC1114Arr = enumC1114Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        c24564.m54859(enumC1114, bArr4[i22 + 1] & 255, -1, (C17347) treeMap.get(Integer.valueOf(m21332(i22 + 2, bArr4) + i3)));
                        break;
                    case 4:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC1114Arr = enumC1114Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        int iM21332 = m21332(i22 + 2, bArr4) + i3;
                        int i23 = bArr4[i22 + 1];
                        int i24 = i23 & 255;
                        int i25 = i23 & 15;
                        int i26 = i24 >> 4;
                        if (i25 != i26) {
                            c24564.m54859(enumC1114, i25, i26, (C17347) treeMap.get(Integer.valueOf(iM21332)));
                            break;
                        } else {
                            switch (C14537.f45735[enumC1114.ordinal()]) {
                                case 1:
                                case 2:
                                case 3:
                                    c24564.m54859(EnumC1114.f3966, 0, 0, (C17347) treeMap.get(Integer.valueOf(iM21332)));
                                    break;
                                case 4:
                                case 5:
                                case 6:
                                    break;
                                default:
                                    c24564.m54859(enumC1114, i25, i26, (C17347) treeMap.get(Integer.valueOf(iM21332)));
                                    break;
                            }
                        }
                        break;
                    case 5:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC1114Arr = enumC1114Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        c24564.m54859(enumC1114, -1, -1, (C17347) treeMap.get(Integer.valueOf(m21310(i22 + 2, bArr4) + i3)));
                        break;
                    case 6:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC1114Arr = enumC1114Arr2;
                        bitSet2 = bitSet8;
                        int iM21310 = m21310(i22 + 2, bArr4) + iNextSetBit;
                        int i27 = bArr4[i22 + 1] & 255;
                        int i28 = iM21310 * 2;
                        if (enumC1114 == EnumC1114.f4113) {
                            int iM21325 = m21325(i28 + 2, bArr4);
                            int iM21311 = m21310(i28 + 4, bArr4);
                            if (iM21325 == 1) {
                                i3 = iNextSetBit;
                                Object obj = new byte[iM21311];
                                System.arraycopy(bArr4, i28 + 8, obj, 0, iM21311);
                                c24564.m54870(enumC1114, i27, obj);
                            } else if (iM21325 == 2) {
                                i3 = iNextSetBit;
                                short[] sArr = new short[iM21311];
                                for (int i29 = 0; i29 < iM21311; i29++) {
                                    sArr[i29] = (short) m21332((i29 * 2) + i28 + 8, bArr4);
                                }
                                c24564.m54870(enumC1114, i27, sArr);
                            } else if (iM21325 == 4) {
                                i3 = iNextSetBit;
                                int[] iArr = new int[iM21311];
                                for (int i30 = 0; i30 < iM21311; i30++) {
                                    iArr[i30] = m21310((i30 * 4) + i28 + 8, bArr4);
                                }
                                c24564.m54870(enumC1114, i27, iArr);
                            } else if (iM21325 != 8) {
                                i3 = iNextSetBit;
                            } else {
                                long[] jArr = new long[iM21311];
                                int i31 = 0;
                                while (i31 < iM21311) {
                                    int i32 = (i31 * 8) + i28 + 8;
                                    jArr[i31] = (((long) m21325(i32 + 2, bArr4)) << 16) | ((long) m21325(i32, bArr4)) | (((long) m21325(i32 + 4, bArr4)) << 32) | (((long) m21325(i32 + 6, bArr4)) << 48);
                                    i31++;
                                    iNextSetBit = iNextSetBit;
                                    iM21311 = iM21311;
                                }
                                i3 = iNextSetBit;
                                c24564.m54870(enumC1114, i27, jArr);
                            }
                        } else {
                            i3 = iNextSetBit;
                            if (enumC1114 == EnumC1114.f4071) {
                                int iM21334 = m21332(i28 + 2, bArr4);
                                int[] iArr2 = new int[iM21334];
                                C17347[] c17347Arr2 = new C17347[iM21334];
                                int i33 = i28 + 4;
                                for (int i34 = 0; i34 < iM21334; i34++) {
                                    iArr2[i34] = m21310((i34 * 4) + i33, bArr4);
                                }
                                int i35 = (iM21334 * 4) + i33;
                                for (int i36 = 0; i36 < iM21334; i36++) {
                                    c17347Arr2[i36] = (C17347) treeMap.get(Integer.valueOf(m21310((i36 * 4) + i35, bArr4) + i3));
                                }
                                c24564.m54862(enumC1114, i27, iArr2, c17347Arr2);
                            } else {
                                int iM21335 = m21332(i28 + 2, bArr4);
                                int iM21312 = m21310(i28 + 4, bArr4);
                                C17347[] c17347Arr3 = new C17347[iM21335];
                                int i37 = i28 + 8;
                                for (int i38 = 0; i38 < iM21335; i38++) {
                                    c17347Arr3[i38] = (C17347) treeMap.get(Integer.valueOf(m21310(i37, bArr4) + i3));
                                    i37 += 4;
                                }
                                c24564.m54860(enumC1114, i27, iM21312, c17347Arr3);
                            }
                        }
                        break;
                    case 7:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC1114Arr = enumC1114Arr2;
                        bitSet2 = bitSet8;
                        c24564.m54854(enumC1114);
                        i3 = iNextSetBit;
                        break;
                    case 8:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC1114Arr = enumC1114Arr2;
                        bitSet2 = bitSet8;
                        c24564.m54855(enumC1114, bArr4[i22 + 1] & 255);
                        i3 = iNextSetBit;
                        break;
                    case 9:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC1114Arr = enumC1114Arr2;
                        bitSet2 = bitSet8;
                        int i39 = bArr4[i22 + 1];
                        c24564.m54856(enumC1114, i39 & 15, (i39 & 255) >> 4);
                        i3 = iNextSetBit;
                        break;
                    case 10:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC1114Arr = enumC1114Arr2;
                        bitSet2 = bitSet8;
                        int i40 = bArr4[i22 + 1] & 255;
                        int iM21329 = m21325(i22 + 2, bArr4);
                        int i41 = C14537.f45736[enumC1114.f4169.ordinal()];
                        if (i41 == 1) {
                            c24564.m54861(enumC1114, i40, m21330(iM21329));
                        } else if (i41 != 2) {
                            if (i41 == 4) {
                                c24564.mo7495(enumC1114, i40, -1, m21335(iM21329));
                            } else if (i41 == 7) {
                                c24564.m54861(enumC1114, i40, m21337(iM21329));
                            } else if (i41 == 8) {
                                c24564.m54861(enumC1114, i40, m21331(iM21329));
                            }
                        } else if (enumC1114 == EnumC1114.f4139) {
                            c24564.m54861(enumC1114, i40, new C15855(m21329(iM21329)));
                        } else {
                            c24564.m54858(enumC1114, i40, -1, m21329(iM21329));
                        }
                        i3 = iNextSetBit;
                        break;
                    case 11:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC1114Arr = enumC1114Arr2;
                        bitSet2 = bitSet8;
                        int i42 = bArr4[i22 + 1];
                        int i43 = i42 & 255;
                        int iM213210 = m21325(i22 + 2, bArr4);
                        int i44 = C14537.f45736[enumC1114.f4169.ordinal()];
                        if (i44 == 2) {
                            c24564.m54858(enumC1114, i42 & 15, i43 >> 4, m21329(iM213210));
                        } else if (i44 == 4) {
                            c24564.mo7495(enumC1114, i42 & 15, i43 >> 4, m21335(iM213210));
                        }
                        i3 = iNextSetBit;
                        break;
                    case 12:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC1114Arr = enumC1114Arr2;
                        bitSet2 = bitSet8;
                        if (enumC1114.f4169 == EnumC10062.kIndexStringRef) {
                            c24564.m54861(enumC1114, bArr4[i22 + 1] & 255, m21330(m21310(i22 + 2, bArr4)));
                        }
                        i3 = iNextSetBit;
                        break;
                    case 13:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC1114Arr = enumC1114Arr2;
                        bitSet2 = bitSet8;
                        int i45 = bArr4[i22 + 1];
                        int iM213211 = m21325(i22 + 2, bArr4);
                        int i46 = bArr4[i22 + 4];
                        int i47 = i46 & 255;
                        int i48 = bArr4[i22 + 5];
                        int i49 = i48 & 255;
                        int i50 = (i45 & 255) >> 4;
                        int[] iArr3 = new int[i50];
                        if (i50 == 1) {
                            iArr3[0] = i46 & 15;
                        } else {
                            if (i50 != 2) {
                                if (i50 != 3) {
                                    if (i50 != 4) {
                                        if (i50 == 5) {
                                            iArr3[4] = i45 & 15;
                                        }
                                        i3 = iNextSetBit;
                                    }
                                    iArr3[3] = (i49 >> 4) & 15;
                                }
                                iArr3[2] = i48 & 15;
                            }
                            iArr3[1] = (i47 >> 4) & 15;
                            iArr3[0] = i46 & 15;
                        }
                        EnumC10062 enumC10062 = enumC1114.f4169;
                        if (enumC10062 == EnumC10062.kIndexTypeRef) {
                            c24564.m54863(enumC1114, iArr3, m21329(iM213211));
                        } else if (enumC10062 == EnumC10062.kIndexCallSiteRef) {
                            c24564.m54866(enumC1114, iArr3, m21316(iM213211));
                        } else {
                            c24564.m54864(enumC1114, iArr3, m21328(iM213211));
                        }
                        i3 = iNextSetBit;
                        break;
                    case 14:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC1114Arr = enumC1114Arr2;
                        bitSet2 = bitSet8;
                        int i51 = bArr4[i22 + 1] & 255;
                        int iM213212 = m21325(i22 + 2, bArr4);
                        int iM213213 = m21325(i22 + 4, bArr4);
                        int[] iArr4 = new int[i51];
                        for (int i52 = 0; i52 < i51; i52++) {
                            iArr4[i52] = iM213213 + i52;
                        }
                        EnumC10062 enumC10063 = enumC1114.f4169;
                        if (enumC10063 == EnumC10062.kIndexTypeRef) {
                            c24564.m54863(enumC1114, iArr4, m21329(iM213212));
                        } else if (enumC10063 == EnumC10062.kIndexCallSiteRef) {
                            c24564.m54866(enumC1114, iArr4, m21316(iM213212));
                        } else {
                            c24564.m54864(enumC1114, iArr4, m21328(iM213212));
                        }
                        i3 = iNextSetBit;
                        break;
                    case 15:
                        bitSet = bitSet7;
                        num = num3;
                        int i53 = bArr4[i22 + 1];
                        int iM213214 = m21325(i22 + 2, bArr4);
                        int i54 = bArr4[i22 + 4];
                        int i55 = i54 & 255;
                        int i56 = bArr4[i22 + 5];
                        enumC1114Arr = enumC1114Arr2;
                        int i57 = i56 & 255;
                        int iM213215 = m21325(i22 + 6, bArr4);
                        int i58 = (i53 & 255) >> 4;
                        it = it;
                        int[] iArr5 = new int[i58];
                        bitSet2 = bitSet8;
                        if (i58 == 1) {
                            iArr5[0] = i54 & 15;
                        } else {
                            if (i58 != 2) {
                                if (i58 != 3) {
                                    if (i58 != 4) {
                                        if (i58 == 5) {
                                            iArr5[4] = i53 & 15;
                                        }
                                    }
                                    iArr5[3] = (i57 >> 4) & 15;
                                }
                                iArr5[2] = i56 & 15;
                            }
                            iArr5[1] = (i55 >> 4) & 15;
                            iArr5[0] = i54 & 15;
                        }
                        c24564.m54865(enumC1114, iArr5, m21328(iM213214), m21331(iM213215));
                        i3 = iNextSetBit;
                        break;
                    case 16:
                        bitSet = bitSet7;
                        num = num3;
                        int i59 = bArr4[i22 + 1] & 255;
                        int iM213216 = m21325(i22 + 2, bArr4);
                        int iM213217 = m21325(i22 + 4, bArr4);
                        int iM213218 = m21325(i22 + 6, bArr4);
                        int[] iArr6 = new int[i59];
                        for (int i60 = 0; i60 < i59; i60++) {
                            iArr6[i60] = iM213217 + i60;
                        }
                        c24564.m54865(enumC1114, iArr6, m21328(iM213216), m21331(iM213218));
                        enumC1114Arr = enumC1114Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 17:
                        bitSet = bitSet7;
                        num = num3;
                        c24564.m54856(enumC1114, bArr4[i22 + 1] & 255, m21325(i22 + 2, bArr4));
                        enumC1114Arr = enumC1114Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 18:
                        bitSet = bitSet7;
                        num = num3;
                        c24564.m54869(enumC1114, bArr4[i22 + 1] & 255, bArr4[i22 + 2] & 255, bArr4[i22 + 3] & 255);
                        enumC1114Arr = enumC1114Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 19:
                        bitSet = bitSet7;
                        num = num3;
                        c24564.m54856(enumC1114, m21325(i22 + 2, bArr4), m21325(i22 + 4, bArr4));
                        enumC1114Arr = enumC1114Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 20:
                        bitSet = bitSet7;
                        num = num3;
                        int i61 = bArr4[i22 + 1];
                        c24564.m54861(enumC1114, i61 & 15, Integer.valueOf(i61 >> 4));
                        enumC1114Arr = enumC1114Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 21:
                        bitSet = bitSet7;
                        num = num3;
                        int i62 = bArr4[i22 + 1] & 255;
                        int iM21336 = m21332(i22 + 2, bArr4);
                        if (enumC1114 == EnumC1114.f4040) {
                            c24564.m54861(enumC1114, i62, Integer.valueOf(iM21336 << 16));
                        } else {
                            c24564.m54861(enumC1114, i62, Long.valueOf(((long) iM21336) << 48));
                        }
                        enumC1114Arr = enumC1114Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 22:
                        bitSet = bitSet7;
                        num = num3;
                        int i63 = bArr4[i22 + 1] & 255;
                        int iM21337 = m21332(i22 + 2, bArr4);
                        if (enumC1114 == EnumC1114.f4063) {
                            c24564.m54861(enumC1114, i63, Integer.valueOf(iM21337));
                        } else {
                            c24564.m54861(enumC1114, i63, Long.valueOf(iM21337));
                        }
                        enumC1114Arr = enumC1114Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 23:
                        bitSet = bitSet7;
                        num = num3;
                        c24564.m54857(enumC1114, bArr4[i22 + 1] & 255, bArr4[i22 + 2] & 255, bArr4[i22 + 3]);
                        enumC1114Arr = enumC1114Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 24:
                        bitSet = bitSet7;
                        num = num3;
                        int i64 = bArr4[i22 + 1];
                        c24564.m54857(enumC1114, i64 & 15, (i64 & 255) >> 4, m21332(i22 + 2, bArr4));
                        enumC1114Arr = enumC1114Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 25:
                        bitSet = bitSet7;
                        num = num3;
                        int i65 = bArr4[i22 + 1] & 255;
                        int iM21313 = m21310(i22 + 2, bArr4);
                        if (enumC1114 == EnumC1114.f4002) {
                            c24564.m54861(enumC1114, i65, Integer.valueOf(iM21313));
                        } else {
                            c24564.m54861(enumC1114, i65, Long.valueOf(iM21313));
                        }
                        enumC1114Arr = enumC1114Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 26:
                        bitSet = bitSet7;
                        num = num3;
                        c24564.m54861(enumC1114, bArr4[i22 + 1] & 255, Long.valueOf((((long) m21325(i22 + 4, bArr4)) << 16) | ((long) m21325(i22 + 2, bArr4)) | (((long) m21325(i22 + 6, bArr4)) << 32) | (((long) m21325(i22 + 8, bArr4)) << 48)));
                        enumC1114Arr = enumC1114Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                }
                BitSet bitSet9 = bitSet2;
                iNextSetBit = bitSet9.nextSetBit(i3 + 1);
                num3 = num;
                bitSet8 = bitSet9;
                bitSet7 = bitSet;
                enumC1114Arr2 = enumC1114Arr;
                it = it;
            }
            bitSet = bitSet7;
            num = num3;
            enumC1114Arr = enumC1114Arr2;
            i3 = iNextSetBit;
            bitSet2 = bitSet8;
            BitSet bitSet10 = bitSet2;
            iNextSetBit = bitSet10.nextSetBit(i3 + 1);
            num3 = num;
            bitSet8 = bitSet10;
            bitSet7 = bitSet;
            enumC1114Arr2 = enumC1114Arr;
            it = it;
        }
        Iterator it2 = it;
        while (num3 != null) {
            c24564.m54868((C17347) treeMap.get(num3));
            if (!it2.hasNext()) {
                return;
            } else {
                num3 = (Integer) it2.next();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C24807 m21316(int i) {
        ByteBuffer byteBuffer = this.f26087;
        byteBuffer.position(i * 4);
        int i2 = byteBuffer.getInt();
        ByteBuffer byteBuffer2 = this.f26084;
        byteBuffer2.position(i2);
        int iM21326 = m21326(byteBuffer2);
        Object[] objArr = new Object[iM21326];
        for (int i3 = 0; i3 < iM21326; i3++) {
            objArr[i3] = m21314(byteBuffer2);
        }
        Object[] objArrCopyOfRange = iM21326 > 3 ? Arrays.copyOfRange(objArr, 3, iM21326) : new Object[0];
        String.format("call_site_%d", Integer.valueOf(i));
        return new C24807((C20331) objArr[0], (String) objArr[1], (C12126) objArr[2], objArrCopyOfRange);
    }
}
