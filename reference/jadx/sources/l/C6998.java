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

/* JADX INFO: renamed from: l.ۜ᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 058F */
/* JADX INFO: loaded from: classes2.dex */
public final class C6998 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f23537;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f23538;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f23539;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f23540;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f23541;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f23542;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f23543;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f23544;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f23545;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f23547;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f23548;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f23549;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f23550;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String[] f23551;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f23552;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f23553;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f23554;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f23556;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f23557;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f23558;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f23559;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f23560;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f23561;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f23562;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f23563;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f23564;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f23565;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C19805 f23546 = new C19805(C5464.f18831 * 3);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C19805 f23555 = new C19805();

    public C6998(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        int i4;
        byteBuffer.position(0);
        ByteBuffer byteBufferOrder = byteBuffer.asReadOnlyBuffer().order(ByteOrder.BIG_ENDIAN);
        int i5 = byteBufferOrder.getInt() & (-256);
        if (i5 != 1684371456) {
            if (i5 == 1684371712) {
                throw new C23560("Odex unsupported.");
            }
            throw new C23560("Magic unsupported.");
        }
        int i6 = byteBufferOrder.getInt() >> 8;
        if (i6 < 3158837 || i6 > 3158848) {
            System.err.println("Unknown DEX version. Trying anyway...");
        }
        this.f23554 = i6;
        byteBufferOrder.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.position(byteBufferOrder.position() + 32);
        if (byteBufferOrder.getInt() != 305419896) {
            throw new C23560("Endian_tag unsupported");
        }
        byteBufferOrder.position(byteBufferOrder.position() + 8);
        int i7 = byteBufferOrder.getInt();
        int i8 = byteBufferOrder.getInt();
        this.f23556 = i8;
        int i9 = byteBufferOrder.getInt();
        this.f23549 = byteBufferOrder.getInt();
        int i10 = byteBufferOrder.getInt();
        this.f23562 = byteBufferOrder.getInt();
        int i11 = byteBufferOrder.getInt();
        this.f23559 = byteBufferOrder.getInt();
        int i12 = byteBufferOrder.getInt();
        this.f23548 = byteBufferOrder.getInt();
        int i13 = byteBufferOrder.getInt();
        this.f23540 = byteBufferOrder.getInt();
        int i14 = byteBufferOrder.getInt();
        this.f23551 = new String[i8];
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
        this.f23564 = i4;
        this.f23537 = m18779(byteBufferOrder, i9, this.f23556 * 4);
        this.f23557 = m18779(byteBufferOrder, i10, this.f23549 * 4);
        this.f23545 = m18779(byteBufferOrder, i11, this.f23562 * 12);
        this.f23558 = m18779(byteBufferOrder, i12, this.f23559 * 8);
        this.f23560 = m18779(byteBufferOrder, i13, this.f23548 * 8);
        this.f23552 = m18779(byteBufferOrder, i14, this.f23540 * 32);
        this.f23542 = m18779(byteBufferOrder, i3, i4 * 4);
        this.f23547 = m18779(byteBufferOrder, i, i2 * 8);
        byteBufferOrder.position(0);
        ByteBuffer byteBufferDuplicate = byteBufferOrder.duplicate();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f23539 = byteBufferDuplicate.order(byteOrder);
        this.f23553 = byteBufferOrder.duplicate().order(byteOrder);
        this.f23541 = byteBufferOrder.duplicate().order(byteOrder);
        this.f23550 = byteBufferOrder.duplicate().order(byteOrder);
        this.f23538 = byteBufferOrder.duplicate().order(byteOrder);
        this.f23544 = byteBufferOrder.duplicate().order(byteOrder);
        this.f23561 = byteBufferOrder.duplicate().order(byteOrder);
        this.f23563 = byteBufferOrder.duplicate().order(byteOrder);
        this.f23543 = byteBufferOrder.duplicate().order(byteOrder);
        this.f23565 = byteBufferOrder.duplicate().order(byteOrder);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m18779(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.position(i);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit(i2);
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferSlice;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18782(int i, Throwable th) {
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
        if (th instanceof C23560) {
            sb.append(th.getMessage());
            System.err.println(sb);
            if (th.getCause() != null) {
                m18782(i2, th.getCause());
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m18796(ByteBuffer byteBuffer, int i) {
        int i2 = ((i >> 5) & 7) + 1;
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= ((long) (byteBuffer.get() & 255)) << (i3 * 8);
        }
        int i4 = (8 - i2) * 8;
        return (j << i4) >> i4;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static long m18791(ByteBuffer byteBuffer, int i) {
        int i2 = ((i >> 5) & 7) + 1;
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= ((long) (byteBuffer.get() & 255)) << (i3 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m18777(ByteBuffer byteBuffer, int i) {
        int i2 = ((i >> 5) & 7) + 1;
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= ((long) (byteBuffer.get() & 255)) << (i3 * 8);
        }
        return j << ((int) (((long) (8 - i2)) * 8));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m18794(int i, byte[] bArr) {
        return (bArr[i] & 255) | (bArr[i + 1] << 8);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m18789(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m18774(int i, byte[] bArr) {
        return (bArr[i] & 255) | (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18784(String str, Object... objArr) {
        System.err.printf(str.concat("%n"), objArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18785(TreeMap treeMap, int i) {
        if (treeMap.containsKey(Integer.valueOf(i))) {
            return;
        }
        treeMap.put(Integer.valueOf(i), new C14388(i));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m18790(ByteBuffer byteBuffer) {
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m18795(ByteBuffer byteBuffer) {
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
    private void m18781(int i, int i2, boolean z, C3097 c3097, TreeMap treeMap, C17916 c17916) {
        ByteBuffer byteBuffer = this.f23565;
        byteBuffer.position(i);
        int iM18790 = m18790(byteBuffer);
        int iM18791 = m18790(byteBuffer);
        C13349[] c13349Arr = new C13349[i2];
        int i3 = 0;
        for (String str : c3097.m9291()) {
            i3 = (str.equals("J") || str.equals("D")) ? i3 + 2 : i3 + 1;
        }
        int i4 = i2 - i3;
        if (!z) {
            c13349Arr[i4 - 1] = new C13349();
        }
        String[] strArrM9291 = c3097.m9291();
        for (int i5 = 0; i5 < iM18791; i5++) {
            String str2 = strArrM9291[i5];
            String strM18798 = m18798(m18790(byteBuffer) - 1);
            c13349Arr[i4] = new C13349();
            if (strM18798 != null) {
                c17916.mo36718(i5, strM18798);
            }
            i4 = (str2.equals("J") || str2.equals("D")) ? i4 + 2 : i4 + 1;
        }
        int iM18792 = 0;
        while (true) {
            int i6 = iM18790;
            while (true) {
                int i7 = byteBuffer.get() & 255;
                switch (i7) {
                    case 0:
                        return;
                    case 1:
                        iM18792 = m18790(byteBuffer) + iM18792;
                        break;
                    case 2:
                        break;
                    case 3:
                        int iM18793 = m18790(byteBuffer);
                        int iM18794 = m18790(byteBuffer) - 1;
                        int iM18795 = m18790(byteBuffer) - 1;
                        String strM18799 = m18798(iM18794);
                        String strM18771 = m18771(iM18795);
                        c13349Arr[iM18793] = new C13349();
                        m18785(treeMap, iM18792);
                        c17916.mo36720(iM18793, (C14388) treeMap.get(Integer.valueOf(iM18792)), strM18799, strM18771, null);
                        break;
                    case 4:
                        int iM18796 = m18790(byteBuffer);
                        int iM18797 = m18790(byteBuffer) - 1;
                        int iM18798 = m18790(byteBuffer) - 1;
                        int iM18799 = m18790(byteBuffer) - 1;
                        String strM187910 = m18798(iM18797);
                        String strM18772 = m18771(iM18798);
                        String strM187911 = m18798(iM18799);
                        C13349 c13349 = new C13349();
                        m18785(treeMap, iM18792);
                        c17916.mo36720(iM18796, (C14388) treeMap.get(Integer.valueOf(iM18792)), strM187910, strM18772, strM187911);
                        c13349Arr[iM18796] = c13349;
                        break;
                    case 5:
                        int iM187910 = m18790(byteBuffer);
                        if (c13349Arr[iM187910] == null) {
                            throw new RuntimeException(C8479.m22141(iM187910, "Encountered RESTART_LOCAL on new v"));
                        }
                        m18785(treeMap, iM18792);
                        c17916.mo36719(iM187910, (C14388) treeMap.get(Integer.valueOf(iM18792)));
                        break;
                        break;
                    case 6:
                        int iM187911 = m18790(byteBuffer);
                        if (c13349Arr[iM187911] == null) {
                            throw new RuntimeException(C8479.m22141(iM187911, "Encountered RESTART_LOCAL on new v"));
                        }
                        m18785(treeMap, iM18792);
                        c17916.mo36723(iM187911, (C14388) treeMap.get(Integer.valueOf(iM18792)));
                        break;
                        break;
                    case 7:
                        m18785(treeMap, iM18792);
                        c17916.mo36725((C14388) treeMap.get(Integer.valueOf(iM18792)));
                        break;
                    case 8:
                        m18785(treeMap, iM18792);
                        c17916.mo36721((C14388) treeMap.get(Integer.valueOf(iM18792)));
                        break;
                    case 9:
                        break;
                    default:
                        if (i7 < 10) {
                            throw new RuntimeException(C8479.m22141(i7, "Invalid extended opcode encountered "));
                        }
                        int i8 = i7 - 10;
                        int i9 = (i8 / 15) + iM18792;
                        int i10 = ((i8 % 15) - 4) + i6;
                        m18785(treeMap, i9);
                        c17916.mo36724(i10, (C14388) treeMap.get(Integer.valueOf(i9)));
                        i6 = i10;
                        iM18792 = i9;
                        break;
                        break;
                }
            }
            iM18790 = m18795(byteBuffer) + i6;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m18803() {
        return this.f23554;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18801(C8410 c8410, int i) {
        c8410.mo22040(this.f23554);
        int i2 = this.f23540;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBuffer = this.f23552;
            byteBuffer.position(i3 * 32);
            arrayList.add(new C4175(m18771(byteBuffer.getInt()), i3));
        }
        Collections.sort(arrayList);
        for (int i4 = 0; i4 < i2; i4++) {
            m18802(c8410, ((C4175) arrayList.get(i4)).f15224, i);
        }
        c8410.mo2997();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18802(C8410 c8410, int i, int i2) {
        ByteBuffer byteBuffer = this.f23552;
        byteBuffer.position(i * 32);
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        int i6 = byteBuffer.getInt();
        int i7 = byteBuffer.getInt();
        int i8 = byteBuffer.getInt();
        int i9 = byteBuffer.getInt();
        int i10 = byteBuffer.getInt();
        String strM18771 = m18771(i3);
        try {
            C11813 c11813Mo2996 = c8410.mo2996(strM18771, m18771(i5), m18793(i6), i4);
            if (c11813Mo2996 != null) {
                m18787(c11813Mo2996, i7, i8, i9, i10, i2);
            }
        } catch (Exception e) {
            C23560 c23560 = new C23560(e, "Error process class: [%d]%s", Integer.valueOf(i3), strM18771);
            if ((i2 & 32) != 0) {
                m18782(0, c23560);
                return;
            }
            throw c23560;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m18778(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        int i = b & 255;
        boolean z = b & bo.j;
        if (z == 0) {
            return Byte.valueOf((byte) m18796(byteBuffer, i));
        }
        if (z == 6) {
            return Long.valueOf(m18796(byteBuffer, i));
        }
        if (z == 2) {
            return Short.valueOf((short) m18796(byteBuffer, i));
        }
        if (z == 3) {
            return Character.valueOf((char) m18791(byteBuffer, i));
        }
        if (z == 4) {
            return Integer.valueOf((int) m18796(byteBuffer, i));
        }
        if (z == 16) {
            return Float.valueOf(Float.intBitsToFloat((int) (m18777(byteBuffer, i) >> 32)));
        }
        if (z == 17) {
            return Double.valueOf(Double.longBitsToDouble(m18777(byteBuffer, i)));
        }
        switch (z ? 1 : 0) {
            case 21:
                return m18788((int) m18791(byteBuffer, i));
            case 22:
                return m18772((int) m18791(byteBuffer, i));
            case 23:
                return m18798((int) m18791(byteBuffer, i));
            case 24:
                return new C1686(m18771((int) m18791(byteBuffer, i)));
            case 25:
                return m18797((int) m18791(byteBuffer, i));
            case 26:
                return m18792((int) m18791(byteBuffer, i));
            case 27:
                return m18797((int) m18791(byteBuffer, i));
            case 28:
                int iM18790 = m18790(byteBuffer);
                Object[] objArr = new Object[iM18790];
                for (int i2 = 0; i2 < iM18790; i2++) {
                    objArr[i2] = m18778(byteBuffer);
                }
                return objArr;
            case 29:
                return m18773(byteBuffer);
            case 30:
                return null;
            case 31:
                return Boolean.valueOf(((i >> 5) & 3) != 0);
            default:
                throw new C23560("Not support yet.");
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C4902 m18772(int i) {
        ByteBuffer byteBuffer = this.f23547;
        byteBuffer.position(i * 8);
        int i2 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        byteBuffer.getShort();
        int i3 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
                return new C4902(i2, m18797(i3));
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return new C4902(i2, m18792(i3));
            default:
                throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18787(C11813 c11813, int i, int i2, int i3, int i4, int i5) {
        Map map;
        Map map2;
        Map map3;
        Object[] objArr;
        if ((i5 & 1) == 0 && i != -1) {
            c11813.f39683 = m18798(i);
        }
        int i6 = i5 & 8;
        C19805 c19805 = this.f23546;
        if (i6 == 0) {
            map = (Map) c19805.m45009();
            map2 = (Map) c19805.m45009();
            map3 = (Map) c19805.m45009();
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
                ByteBuffer byteBuffer = this.f23539;
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
                        m18783(i7, c11813);
                    } catch (Exception e) {
                        throw new C23560("error on reading Annotation of class ", e);
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
            ByteBuffer byteBuffer2 = this.f23538;
            byteBuffer2.position(i3);
            int iM18790 = m18790(byteBuffer2);
            int iM18791 = m18790(byteBuffer2);
            int iM18792 = m18790(byteBuffer2);
            int iM18793 = m18790(byteBuffer2);
            if ((i5 & 16) != 0 || i4 == 0) {
                objArr = null;
            } else {
                ByteBuffer byteBuffer3 = this.f23563;
                byteBuffer3.position(i4);
                int iM18794 = m18790(byteBuffer3);
                objArr = new Object[iM18794];
                for (int i14 = 0; i14 < iM18794; i14++) {
                    objArr[i14] = m18778(byteBuffer3);
                }
            }
            Object[] objArr2 = objArr;
            int iM18775 = 0;
            int i15 = 0;
            while (i15 < iM18790) {
                iM18775 = m18775(byteBuffer2, iM18775, c11813, map4, (objArr2 == null || i15 >= objArr2.length) ? null : objArr2[i15], i5);
                i15++;
                iM18793 = iM18793;
                iM18792 = iM18792;
                objArr2 = objArr2;
            }
            int i16 = iM18793;
            int i17 = iM18792;
            int iM18776 = 0;
            for (int i18 = 0; i18 < iM18791; i18++) {
                iM18776 = m18775(byteBuffer2, iM18776, c11813, map4, (Object) null, i5);
            }
            int iM18777 = 0;
            boolean z = true;
            int i19 = 0;
            while (i19 < i17) {
                iM18777 = m18776(byteBuffer2, iM18777, c11813, map5, map6, i5, z);
                i19++;
                z = false;
            }
            int iM18778 = 0;
            boolean z2 = true;
            int i20 = 0;
            while (i20 < i16) {
                iM18778 = m18776(byteBuffer2, iM18778, c11813, map5, map6, i5, z2);
                i20++;
                z2 = false;
            }
        }
        if (map4 != null) {
            map4.clear();
            c19805.m45011(map4);
        }
        if (map5 != null) {
            map5.clear();
            c19805.m45011(map5);
        }
        if (map6 != null) {
            map6.clear();
            c19805.m45011(map6);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18783(int i, InterfaceC18993 interfaceC18993) {
        ByteBuffer byteBuffer = this.f23553;
        byteBuffer.position(i);
        int i2 = byteBuffer.getInt();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = byteBuffer.getInt();
            ByteBuffer byteBuffer2 = this.f23541;
            byteBuffer2.position(i4);
            int i5 = byteBuffer2.get() & 255;
            C13930 c13930M18773 = m18773(byteBuffer2);
            EnumC11959 enumC11959 = EnumC11959.values()[i5];
            c13930M18773.f45872 = enumC11959;
            C13930 c13930Mo21702 = interfaceC18993.mo21702(c13930M18773.f45873, enumC11959);
            for (C4756 c4756 : c13930M18773.f45871) {
                C13930.m33768(c13930Mo21702, c4756.f16752, c4756.f16753);
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C13930 m18773(ByteBuffer byteBuffer) {
        int iM18790 = m18790(byteBuffer);
        int iM18791 = m18790(byteBuffer);
        C13930 c13930 = new C13930(m18771(iM18790), EnumC11959.RUNTIME);
        for (int i = 0; i < iM18791; i++) {
            c13930.f45871.add(new C4756(m18798(m18790(byteBuffer)), m18778(byteBuffer)));
        }
        return c13930;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C9449 m18797(int i) {
        ByteBuffer byteBuffer = this.f23558;
        byteBuffer.position(i * 8);
        int i2 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        int i3 = 65535 & byteBuffer.getShort();
        return new C9449(m18771(i2), m18798(byteBuffer.getInt()), m18771(i3));
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private String[] m18793(int i) {
        if (i == 0) {
            return new String[0];
        }
        ByteBuffer byteBuffer = this.f23543;
        byteBuffer.position(i);
        int i2 = byteBuffer.getInt();
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = m18771(65535 & byteBuffer.getShort());
        }
        return strArr;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C14076 m18788(int i) {
        ByteBuffer byteBuffer = this.f23545;
        byteBuffer.position((i * 12) + 4);
        return new C14076(m18771(byteBuffer.getInt()), m18793(byteBuffer.getInt()));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C3097 m18792(int i) {
        ByteBuffer byteBuffer = this.f23560;
        byteBuffer.position(i * 8);
        int i2 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        int i3 = 65535 & byteBuffer.getShort();
        return new C3097(m18771(i2), m18798(byteBuffer.getInt()), m18788(i3));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private String m18798(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this.f23551;
        if (i >= strArr.length) {
            return null;
        }
        String str = strArr[i];
        if (str != null) {
            return str;
        }
        C19805 c19805 = this.f23555;
        int i2 = this.f23537.getInt(i * 4);
        ByteBuffer byteBuffer = this.f23561;
        byteBuffer.position(i2);
        int iM18790 = m18790(byteBuffer);
        try {
            StringBuilder sb = (StringBuilder) c19805.m45009();
            if (sb == null) {
                sb = new StringBuilder((int) (((double) iM18790) * 1.5d));
            }
            String strM42498 = C18287.m42498(byteBuffer, sb);
            if (sb.length() < 100) {
                sb.setLength(0);
                c19805.m45011(sb);
            }
            strArr[i] = strM42498;
            return strM42498;
        } catch (UTFDataFormatException e) {
            throw new C23560(e, "fail to load string %d@%08x", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private String m18771(int i) {
        if (i == -1) {
            return null;
        }
        return m18798(this.f23557.getInt(i * 4));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m18775(ByteBuffer byteBuffer, int i, C11813 c11813, Map map, Object obj, int i2) {
        Integer num;
        int iM18790 = m18790(byteBuffer);
        int iM18791 = m18790(byteBuffer);
        int i3 = i + iM18790;
        C9449 c9449M18797 = m18797(i3);
        if (c11813.f39687 == null) {
            c11813.f39687 = new ArrayList();
        }
        C21690 c21690 = new C21690();
        c21690.f70369 = iM18791;
        c21690.f70370 = c9449M18797;
        c21690.f70368 = obj;
        c11813.f39687.add(c21690);
        if ((i2 & 8) != 0 || (num = (Integer) map.get(Integer.valueOf(i3))) == null) {
            return i3;
        }
        try {
            m18783(num.intValue(), c21690);
            return i3;
        } catch (Exception e) {
            throw new C23560(e, "while accept annotation in field:%s.", c9449M18797.toString());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m18776(ByteBuffer byteBuffer, int i, C11813 c11813, Map map, Map map2, int i2, boolean z) {
        InterfaceC18993 interfaceC18993M21703;
        int iPosition = byteBuffer.position();
        int iM18790 = m18790(byteBuffer);
        int iM18791 = m18790(byteBuffer);
        int iM18792 = m18790(byteBuffer);
        int i3 = i + iM18790;
        C3097 c3097M18792 = m18792(i3);
        if (!z && iM18790 == 0) {
            m18784("GLITCH: duplicated method %s @%08x", c3097M18792.toString(), Integer.valueOf(iPosition));
            if ((i2 & 64) == 0) {
                m18784("WARN: skip method %s @%08x", c3097M18792.toString(), Integer.valueOf(iPosition));
                return i3;
            }
        }
        if ((65536 & iM18791) == 0 && (c3097M18792.m9295().equals("<init>") || c3097M18792.m9295().equals("<clinit>"))) {
            m18784("GLITCH: method %s @%08x not marked as ACC_CONSTRUCTOR", c3097M18792.toString(), Integer.valueOf(iPosition));
        }
        try {
            if (c11813.f39688 == null) {
                c11813.f39688 = new ArrayList();
            }
            C8285 c8285 = new C8285();
            c8285.f28775 = iM18791;
            c8285.f28776 = c3097M18792;
            c11813.f39688.add(c8285);
            if ((i2 & 8) == 0) {
                Integer num = (Integer) map.get(Integer.valueOf(i3));
                if (num != null) {
                    try {
                        m18783(num.intValue(), c8285);
                    } catch (Exception e) {
                        throw new C23560(e, "while accept annotation in method:%s.", c3097M18792.toString());
                    }
                }
                Integer num2 = (Integer) map2.get(Integer.valueOf(i3));
                if (num2 != null) {
                    try {
                        int iIntValue = num2.intValue();
                        ByteBuffer byteBuffer2 = this.f23550;
                        byteBuffer2.position(iIntValue);
                        int i4 = byteBuffer2.getInt();
                        for (int i5 = 0; i5 < i4; i5++) {
                            int i6 = byteBuffer2.getInt();
                            if (i6 != 0 && (interfaceC18993M21703 = c8285.m21703(i5)) != null) {
                                try {
                                    m18783(i6, interfaceC18993M21703);
                                } catch (Exception e2) {
                                    throw new C23560(e2, "While accepting parameter annotation in parameter: [%d]", Integer.valueOf(i5));
                                }
                            }
                        }
                    } catch (Exception e3) {
                        throw new C23560(e3, "while accept parameter annotation in method:%s.", c3097M18792.toString());
                    }
                }
            }
            if (iM18792 == 0 || ((i2 & 4) != 0 && ((i2 & 128) == 0 || !c3097M18792.m9295().equals("<clinit>")))) {
                return i3;
            }
            C2639 c2639 = new C2639();
            c2639.f10290 = new ArrayList();
            c2639.f10287 = null;
            c2639.f10289 = -1;
            c8285.f28773 = c2639;
            try {
                m18800(iM18792, c2639, i2, (iM18791 & 8) != 0, c3097M18792);
                return i3;
            } catch (Exception e4) {
                throw new C23560(e4, "while accept code in method:[%s] @%08x", c3097M18792.toString(), Integer.valueOf(iM18792));
            }
        } catch (Exception e5) {
            throw new C23560(e5, "while accept method:[%s]", c3097M18792.toString());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m18799() {
        return this.f23540;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:109:0x0220 A[PHI: r1
      0x0220: PHI (r1v46 int) = (r1v34 int), (r1v38 int), (r1v40 int), (r1v42 int), (r1v44 int), (r1v48 int) binds: [B:108:0x021e, B:100:0x0204, B:97:0x01f9, B:94:0x01f0, B:91:0x01e5, B:88:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x0222 A[PHI: r1
      0x0222: PHI (r1v45 int) = (r1v34 int), (r1v34 int), (r1v38 int), (r1v40 int), (r1v42 int), (r1v44 int), (r1v48 int), (r1v48 int) binds: [B:106:0x021a, B:108:0x021e, B:100:0x0204, B:97:0x01f9, B:94:0x01f0, B:91:0x01e5, B:86:0x01d6, B:88:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ff  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18786(TreeMap treeMap, LinkedList linkedList, byte[] bArr, int i) {
        boolean z;
        char c;
        int iM18789;
        boolean z2;
        int i2 = i * 2;
        if (i2 >= bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = bArr[i2] & 255;
        EnumC21815 enumC21815 = EnumC21815.f70705[i3];
        if (enumC21815 == null || enumC21815.f70860 == null) {
            throw new C1353("zero-width instruction op=0x%02x", Integer.valueOf(i3));
        }
        if (enumC21815.m48573()) {
            switch (C22521.f73488[enumC21815.f70860.ordinal()]) {
                case 1:
                    int i4 = i + bArr[i2 + 1];
                    if (i4 < 0 || i4 * 2 > bArr.length) {
                        throw new C1353("jump out of insns %s -> %04x", enumC21815, Integer.valueOf(i4));
                    }
                    linkedList.add(Integer.valueOf(i4));
                    m18785(treeMap, i4);
                    z = true;
                    break;
                    break;
                case 2:
                case 3:
                    int iM18794 = i + m18794(i2 + 2, bArr);
                    if (iM18794 < 0 || iM18794 * 2 > bArr.length) {
                        throw new C1353("jump out of insns %s -> %04x", enumC21815, Integer.valueOf(iM18794));
                    }
                    linkedList.add(Integer.valueOf(iM18794));
                    m18785(treeMap, iM18794);
                    z = true;
                    break;
                    break;
                case 4:
                    int iM18795 = i + m18794(i2 + 2, bArr);
                    byte b = bArr[i2 + 1];
                    if ((b & 15) == (((b & 255) >> 4) & 15)) {
                        switch (C22521.f73489[enumC21815.ordinal()]) {
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
                        if (iM18795 < 0 || iM18795 * 2 > bArr.length) {
                            throw new C1353("jump out of insns %s -> %04x", enumC21815, Integer.valueOf(iM18795));
                        }
                        linkedList.add(Integer.valueOf(iM18795));
                        m18785(treeMap, iM18795);
                    }
                    break;
                case 5:
                case 6:
                    int iM18774 = i + m18774(i2 + 2, bArr);
                    if (iM18774 < 0 || iM18774 * 2 > bArr.length) {
                        throw new C1353("jump out of insns %s -> %04x", enumC21815, Integer.valueOf(iM18774));
                    }
                    linkedList.add(Integer.valueOf(iM18774));
                    m18785(treeMap, iM18774);
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
        if (enumC21815.m48571()) {
            m18785(treeMap, i + enumC21815.f70860.f75384);
            int iM18775 = (i + m18774(i2 + 2, bArr)) * 2;
            int i5 = iM18775 + 2;
            if (i5 < bArr.length) {
                byte b2 = bArr[iM18775 + 1];
                if (b2 == 1) {
                    c = 0;
                    int iM187810 = m18789(i5, bArr);
                    int i6 = iM18775 + 8;
                    for (int i7 = 0; i7 < iM187810; i7++) {
                        int iM18776 = i + m18774((i7 * 4) + i6, bArr);
                        if (iM18776 < 0 || iM18776 * 2 > bArr.length) {
                            throw new C1353("jump out of insns %s -> %04x", enumC21815, Integer.valueOf(iM18776));
                        }
                        linkedList.add(Integer.valueOf(iM18776));
                        m18785(treeMap, iM18776);
                    }
                } else if (b2 == 2) {
                    int iM187811 = m18789(i5, bArr);
                    int i8 = (iM187811 * 4) + iM18775 + 4;
                    for (int i9 = 0; i9 < iM187811; i9++) {
                        int iM18777 = i + m18774((i9 * 4) + i8, bArr);
                        if (iM18777 < 0 || iM18777 * 2 > bArr.length) {
                            throw new C1353("jump out of insns %s -> %04x", enumC21815, Integer.valueOf(iM18777));
                        }
                        linkedList.add(Integer.valueOf(iM18777));
                        m18785(treeMap, iM18777);
                    }
                    c = 0;
                } else {
                    throw new C1353("bad payload for %s", enumC21815);
                }
            } else {
                throw new C1353("bad payload offset for %s", enumC21815);
            }
        } else {
            c = 0;
        }
        if (z) {
            int i10 = C22521.f73490[enumC21815.f70858.ordinal()];
            int i11 = this.f23548;
            switch (i10) {
                case 1:
                    if (enumC21815.f70860 == EnumC23227.kFmt31c) {
                        iM18789 = m18774(i2 + 2, bArr);
                    } else {
                        iM18789 = m18789(i2 + 2, bArr);
                    }
                    if (iM18789 < 0 || iM18789 >= this.f23556) {
                        z = false;
                    } else {
                        z = true;
                    }
                    break;
                case 2:
                    iM18789 = m18789(i2 + 2, bArr);
                    if (iM18789 < this.f23549) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 3:
                    iM18789 = m18789(i2 + 2, bArr);
                    if (iM18789 < i11) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 4:
                    iM18789 = m18789(i2 + 2, bArr);
                    if (iM18789 < this.f23559) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 5:
                    iM18789 = m18789(i2 + 2, bArr);
                    if (iM18789 < this.f23564) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 6:
                    iM18789 = m18789(i2 + 2, bArr);
                    int iM187812 = m18789(i2 + 6, bArr);
                    if (iM18789 >= i11 || iM187812 >= this.f23562) {
                        z = false;
                    } else {
                        z = true;
                    }
                    break;
                default:
                    iM18789 = Integer.MAX_VALUE;
                    break;
            }
            if (!z) {
                Integer numValueOf = Integer.valueOf(iM18789);
                Object[] objArr = new Object[2];
                objArr[c] = enumC21815;
                objArr[1] = numValueOf;
                throw new C1353("index-out-of-range for %s index: %d", objArr);
            }
        }
        if (z && enumC21815.m48575()) {
            EnumC21815 enumC21816 = EnumC21815.f70832;
            if (enumC21815 == enumC21816) {
                byte b3 = bArr[i2 + 1];
                if (b3 == 0) {
                    linkedList.add(Integer.valueOf(i + enumC21816.f70860.f75384));
                    return;
                }
                if (b3 == 1) {
                    linkedList.add(Integer.valueOf((m18789(i2 + 2, bArr) * 2) + i + 4));
                    return;
                } else if (b3 == 2) {
                    linkedList.add(Integer.valueOf((m18789(i2 + 2, bArr) * 4) + i + 2));
                    return;
                } else {
                    if (b3 != 3) {
                        return;
                    }
                    linkedList.add(Integer.valueOf((((m18774(i2 + 4, bArr) * m18789(i2 + 2, bArr)) + 1) / 2) + i + 4));
                    return;
                }
            }
            linkedList.add(Integer.valueOf(i + enumC21815.f70860.f75384));
        }
    }

    /* JADX WARN: Code duplicated, block: B:218:0x079a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18800(int i, C2639 c2639, int i2, boolean z, C3097 c3097) {
        BitSet bitSet;
        Integer num;
        EnumC21815[] enumC21815Arr;
        int i3;
        BitSet bitSet2;
        boolean z2;
        int i4;
        int i5;
        int i6;
        BitSet bitSet3;
        ByteBuffer byteBuffer = this.f23544;
        byteBuffer.position(i);
        int i7 = byteBuffer.getShort() & 65535;
        byteBuffer.getShort();
        byteBuffer.getShort();
        int i8 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        int i9 = byteBuffer.getInt();
        int i10 = byteBuffer.getInt();
        byte[] bArr = new byte[i10 * 2];
        byteBuffer.get(bArr);
        c2639.f10289 = i7;
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
                        m18785(treeMap, i13);
                        int i16 = i13 + i14;
                        m18785(treeMap, i16);
                        byteBufferOrder.position(iPosition + i15);
                        int iM18795 = m18795(byteBufferOrder);
                        if (iM18795 <= 0) {
                            int i17 = -iM18795;
                            z2 = true;
                            int i18 = i10;
                            i5 = i17;
                            iM18795 = i17 + 1;
                            i4 = i18;
                        } else {
                            z2 = false;
                            i4 = i10;
                            i5 = iM18795;
                        }
                        C14388[] c14388Arr = new C14388[iM18795];
                        String[] strArr = new String[iM18795];
                        int i19 = 0;
                        while (i19 < i5) {
                            BitSet bitSet5 = bitSet4;
                            int iM18790 = m18790(byteBufferOrder);
                            int i20 = i7;
                            int iM18791 = m18790(byteBufferOrder);
                            m18785(treeMap, iM18791);
                            hashSet.add(Integer.valueOf(iM18791));
                            strArr[i19] = m18771(iM18790);
                            c14388Arr[i19] = (C14388) treeMap.get(Integer.valueOf(iM18791));
                            i19++;
                            bitSet4 = bitSet5;
                            i7 = i20;
                        }
                        i6 = i7;
                        bitSet3 = bitSet4;
                        if (z2) {
                            int iM18792 = m18790(byteBufferOrder);
                            m18785(treeMap, iM18792);
                            hashSet.add(Integer.valueOf(iM18792));
                            c14388Arr[i5] = (C14388) treeMap.get(Integer.valueOf(iM18792));
                        }
                        C14388 c14388 = (C14388) treeMap.get(Integer.valueOf(i13));
                        C14388 c14389 = (C14388) treeMap.get(Integer.valueOf(i16));
                        if (c2639.f10287 == null) {
                            c2639.f10287 = new ArrayList(3);
                        }
                        c2639.f10287.add(new C19574(c14388, c14389, c14388Arr, strArr));
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
            c2639.getClass();
            C15341 c15341 = new C15341();
            c15341.f49949 = new ArrayList();
            c2639.f10288 = c15341;
            try {
                m18781(i9, i21, z, c3097, treeMap, c15341);
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
                    m18786(treeMap, linkedList, bArr3, iIntValue);
                } catch (IndexOutOfBoundsException unused2) {
                    bitSet7.set(iIntValue);
                    m18784("GLITCH: %04x %s | not enough space for reading instruction", num2, c3097.toString());
                } catch (C1353 e) {
                    bitSet7.set(iIntValue);
                    m18784("GLITCH: %04x %s | %s", num2, c3097.toString(), e.getMessage());
                }
                bArr2 = bArr3;
            }
        }
        BitSet bitSet8 = bitSet6;
        byte[] bArr4 = bArr2;
        Iterator it = treeMap.keySet().iterator();
        Integer num3 = it.hasNext() ? (Integer) it.next() : null;
        EnumC21815[] enumC21815Arr2 = EnumC21815.f70705;
        int iNextSetBit = bitSet8.nextSetBit(0);
        while (iNextSetBit >= 0) {
            while (num3 != null && num3.intValue() <= iNextSetBit) {
                c2639.m8130((C14388) treeMap.get(num3));
                num3 = it.hasNext() ? (Integer) it.next() : null;
            }
            if (bitSet7.get(iNextSetBit)) {
                c2639.m8131(EnumC21815.f70746);
            } else {
                int i22 = iNextSetBit * 2;
                EnumC21815 enumC21815 = enumC21815Arr2[bArr4[i22] & 255];
                switch (C22521.f73488[enumC21815.f70860.ordinal()]) {
                    case 1:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC21815Arr = enumC21815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        c2639.m8137(enumC21815, -1, -1, (C14388) treeMap.get(Integer.valueOf(bArr4[i22 + 1] + i3)));
                        break;
                    case 2:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC21815Arr = enumC21815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        c2639.m8137(enumC21815, -1, -1, (C14388) treeMap.get(Integer.valueOf(m18794(i22 + 2, bArr4) + i3)));
                        break;
                    case 3:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC21815Arr = enumC21815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        c2639.m8137(enumC21815, bArr4[i22 + 1] & 255, -1, (C14388) treeMap.get(Integer.valueOf(m18794(i22 + 2, bArr4) + i3)));
                        break;
                    case 4:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC21815Arr = enumC21815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        int iM18794 = m18794(i22 + 2, bArr4) + i3;
                        int i23 = bArr4[i22 + 1];
                        int i24 = i23 & 255;
                        int i25 = i23 & 15;
                        int i26 = i24 >> 4;
                        if (i25 != i26) {
                            c2639.m8137(enumC21815, i25, i26, (C14388) treeMap.get(Integer.valueOf(iM18794)));
                            break;
                        } else {
                            switch (C22521.f73489[enumC21815.ordinal()]) {
                                case 1:
                                case 2:
                                case 3:
                                    c2639.m8137(EnumC21815.f70770, 0, 0, (C14388) treeMap.get(Integer.valueOf(iM18794)));
                                    break;
                                case 4:
                                case 5:
                                case 6:
                                    break;
                                default:
                                    c2639.m8137(enumC21815, i25, i26, (C14388) treeMap.get(Integer.valueOf(iM18794)));
                                    break;
                            }
                        }
                        break;
                    case 5:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC21815Arr = enumC21815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        c2639.m8137(enumC21815, -1, -1, (C14388) treeMap.get(Integer.valueOf(m18774(i22 + 2, bArr4) + i3)));
                        break;
                    case 6:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC21815Arr = enumC21815Arr2;
                        bitSet2 = bitSet8;
                        int iM18774 = m18774(i22 + 2, bArr4) + iNextSetBit;
                        int i27 = bArr4[i22 + 1] & 255;
                        int i28 = iM18774 * 2;
                        if (enumC21815 == EnumC21815.f70795) {
                            int iM18789 = m18789(i28 + 2, bArr4);
                            int iM18775 = m18774(i28 + 4, bArr4);
                            if (iM18789 == 1) {
                                i3 = iNextSetBit;
                                Object obj = new byte[iM18775];
                                System.arraycopy(bArr4, i28 + 8, obj, 0, iM18775);
                                c2639.m8146(enumC21815, i27, obj);
                            } else if (iM18789 == 2) {
                                i3 = iNextSetBit;
                                short[] sArr = new short[iM18775];
                                for (int i29 = 0; i29 < iM18775; i29++) {
                                    sArr[i29] = (short) m18794((i29 * 2) + i28 + 8, bArr4);
                                }
                                c2639.m8146(enumC21815, i27, sArr);
                            } else if (iM18789 == 4) {
                                i3 = iNextSetBit;
                                int[] iArr = new int[iM18775];
                                for (int i30 = 0; i30 < iM18775; i30++) {
                                    iArr[i30] = m18774((i30 * 4) + i28 + 8, bArr4);
                                }
                                c2639.m8146(enumC21815, i27, iArr);
                            } else if (iM18789 != 8) {
                                i3 = iNextSetBit;
                            } else {
                                long[] jArr = new long[iM18775];
                                int i31 = 0;
                                while (i31 < iM18775) {
                                    int i32 = (i31 * 8) + i28 + 8;
                                    jArr[i31] = (((long) m18789(i32 + 2, bArr4)) << 16) | ((long) m18789(i32, bArr4)) | (((long) m18789(i32 + 4, bArr4)) << 32) | (((long) m18789(i32 + 6, bArr4)) << 48);
                                    i31++;
                                    iNextSetBit = iNextSetBit;
                                    iM18775 = iM18775;
                                }
                                i3 = iNextSetBit;
                                c2639.m8146(enumC21815, i27, jArr);
                            }
                        } else {
                            i3 = iNextSetBit;
                            if (enumC21815 == EnumC21815.f70784) {
                                int iM18796 = m18794(i28 + 2, bArr4);
                                int[] iArr2 = new int[iM18796];
                                C14388[] c14388Arr2 = new C14388[iM18796];
                                int i33 = i28 + 4;
                                for (int i34 = 0; i34 < iM18796; i34++) {
                                    iArr2[i34] = m18774((i34 * 4) + i33, bArr4);
                                }
                                int i35 = (iM18796 * 4) + i33;
                                for (int i36 = 0; i36 < iM18796; i36++) {
                                    c14388Arr2[i36] = (C14388) treeMap.get(Integer.valueOf(m18774((i36 * 4) + i35, bArr4) + i3));
                                }
                                c2639.m8140(enumC21815, i27, iArr2, c14388Arr2);
                            } else {
                                int iM18797 = m18794(i28 + 2, bArr4);
                                int iM18776 = m18774(i28 + 4, bArr4);
                                C14388[] c14388Arr3 = new C14388[iM18797];
                                int i37 = i28 + 8;
                                for (int i38 = 0; i38 < iM18797; i38++) {
                                    c14388Arr3[i38] = (C14388) treeMap.get(Integer.valueOf(m18774(i37, bArr4) + i3));
                                    i37 += 4;
                                }
                                c2639.m8138(enumC21815, i27, iM18776, c14388Arr3);
                            }
                        }
                        break;
                    case 7:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC21815Arr = enumC21815Arr2;
                        bitSet2 = bitSet8;
                        c2639.m8131(enumC21815);
                        i3 = iNextSetBit;
                        break;
                    case 8:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC21815Arr = enumC21815Arr2;
                        bitSet2 = bitSet8;
                        c2639.m8132(enumC21815, bArr4[i22 + 1] & 255);
                        i3 = iNextSetBit;
                        break;
                    case 9:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC21815Arr = enumC21815Arr2;
                        bitSet2 = bitSet8;
                        int i39 = bArr4[i22 + 1];
                        c2639.m8133(enumC21815, i39 & 15, (i39 & 255) >> 4);
                        i3 = iNextSetBit;
                        break;
                    case 10:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC21815Arr = enumC21815Arr2;
                        bitSet2 = bitSet8;
                        int i40 = bArr4[i22 + 1] & 255;
                        int iM187810 = m18789(i22 + 2, bArr4);
                        int i41 = C22521.f73490[enumC21815.f70858.ordinal()];
                        if (i41 == 1) {
                            c2639.m8139(enumC21815, i40, m18798(iM187810));
                        } else if (i41 != 2) {
                            if (i41 == 4) {
                                c2639.mo8136(enumC21815, i40, -1, m18797(iM187810));
                            } else if (i41 == 7) {
                                c2639.m8139(enumC21815, i40, m18772(iM187810));
                            } else if (i41 == 8) {
                                c2639.m8139(enumC21815, i40, m18788(iM187810));
                            }
                        } else if (enumC21815 == EnumC21815.f70763) {
                            c2639.m8139(enumC21815, i40, new C1686(m18771(iM187810)));
                        } else {
                            c2639.m8135(enumC21815, i40, -1, m18771(iM187810));
                        }
                        i3 = iNextSetBit;
                        break;
                    case 11:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC21815Arr = enumC21815Arr2;
                        bitSet2 = bitSet8;
                        int i42 = bArr4[i22 + 1];
                        int i43 = i42 & 255;
                        int iM187811 = m18789(i22 + 2, bArr4);
                        int i44 = C22521.f73490[enumC21815.f70858.ordinal()];
                        if (i44 == 2) {
                            c2639.m8135(enumC21815, i42 & 15, i43 >> 4, m18771(iM187811));
                        } else if (i44 == 4) {
                            c2639.mo8136(enumC21815, i42 & 15, i43 >> 4, m18797(iM187811));
                        }
                        i3 = iNextSetBit;
                        break;
                    case 12:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC21815Arr = enumC21815Arr2;
                        bitSet2 = bitSet8;
                        if (enumC21815.f70858 == EnumC15466.kIndexStringRef) {
                            c2639.m8139(enumC21815, bArr4[i22 + 1] & 255, m18798(m18774(i22 + 2, bArr4)));
                        }
                        i3 = iNextSetBit;
                        break;
                    case 13:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC21815Arr = enumC21815Arr2;
                        bitSet2 = bitSet8;
                        int i45 = bArr4[i22 + 1];
                        int iM187812 = m18789(i22 + 2, bArr4);
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
                        EnumC15466 enumC15466 = enumC21815.f70858;
                        if (enumC15466 == EnumC15466.kIndexTypeRef) {
                            c2639.m8141(enumC21815, iArr3, m18771(iM187812));
                        } else if (enumC15466 == EnumC15466.kIndexCallSiteRef) {
                            c2639.m8144(enumC21815, iArr3, m18780(iM187812));
                        } else {
                            c2639.m8142(enumC21815, iArr3, m18792(iM187812));
                        }
                        i3 = iNextSetBit;
                        break;
                    case 14:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC21815Arr = enumC21815Arr2;
                        bitSet2 = bitSet8;
                        int i51 = bArr4[i22 + 1] & 255;
                        int iM187813 = m18789(i22 + 2, bArr4);
                        int iM187814 = m18789(i22 + 4, bArr4);
                        int[] iArr4 = new int[i51];
                        for (int i52 = 0; i52 < i51; i52++) {
                            iArr4[i52] = iM187814 + i52;
                        }
                        EnumC15466 enumC15467 = enumC21815.f70858;
                        if (enumC15467 == EnumC15466.kIndexTypeRef) {
                            c2639.m8141(enumC21815, iArr4, m18771(iM187813));
                        } else if (enumC15467 == EnumC15466.kIndexCallSiteRef) {
                            c2639.m8144(enumC21815, iArr4, m18780(iM187813));
                        } else {
                            c2639.m8142(enumC21815, iArr4, m18792(iM187813));
                        }
                        i3 = iNextSetBit;
                        break;
                    case 15:
                        bitSet = bitSet7;
                        num = num3;
                        int i53 = bArr4[i22 + 1];
                        int iM187815 = m18789(i22 + 2, bArr4);
                        int i54 = bArr4[i22 + 4];
                        int i55 = i54 & 255;
                        int i56 = bArr4[i22 + 5];
                        enumC21815Arr = enumC21815Arr2;
                        int i57 = i56 & 255;
                        int iM187816 = m18789(i22 + 6, bArr4);
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
                        c2639.m8143(enumC21815, iArr5, m18792(iM187815), m18788(iM187816));
                        i3 = iNextSetBit;
                        break;
                    case 16:
                        bitSet = bitSet7;
                        num = num3;
                        int i59 = bArr4[i22 + 1] & 255;
                        int iM187817 = m18789(i22 + 2, bArr4);
                        int iM187818 = m18789(i22 + 4, bArr4);
                        int iM187819 = m18789(i22 + 6, bArr4);
                        int[] iArr6 = new int[i59];
                        for (int i60 = 0; i60 < i59; i60++) {
                            iArr6[i60] = iM187818 + i60;
                        }
                        c2639.m8143(enumC21815, iArr6, m18792(iM187817), m18788(iM187819));
                        enumC21815Arr = enumC21815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 17:
                        bitSet = bitSet7;
                        num = num3;
                        c2639.m8133(enumC21815, bArr4[i22 + 1] & 255, m18789(i22 + 2, bArr4));
                        enumC21815Arr = enumC21815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 18:
                        bitSet = bitSet7;
                        num = num3;
                        c2639.m8145(enumC21815, bArr4[i22 + 1] & 255, bArr4[i22 + 2] & 255, bArr4[i22 + 3] & 255);
                        enumC21815Arr = enumC21815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 19:
                        bitSet = bitSet7;
                        num = num3;
                        c2639.m8133(enumC21815, m18789(i22 + 2, bArr4), m18789(i22 + 4, bArr4));
                        enumC21815Arr = enumC21815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 20:
                        bitSet = bitSet7;
                        num = num3;
                        int i61 = bArr4[i22 + 1];
                        c2639.m8139(enumC21815, i61 & 15, Integer.valueOf(i61 >> 4));
                        enumC21815Arr = enumC21815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 21:
                        bitSet = bitSet7;
                        num = num3;
                        int i62 = bArr4[i22 + 1] & 255;
                        int iM18798 = m18794(i22 + 2, bArr4);
                        if (enumC21815 == EnumC21815.f70743) {
                            c2639.m8139(enumC21815, i62, Integer.valueOf(iM18798 << 16));
                        } else {
                            c2639.m8139(enumC21815, i62, Long.valueOf(((long) iM18798) << 48));
                        }
                        enumC21815Arr = enumC21815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 22:
                        bitSet = bitSet7;
                        num = num3;
                        int i63 = bArr4[i22 + 1] & 255;
                        int iM18799 = m18794(i22 + 2, bArr4);
                        if (enumC21815 == EnumC21815.f70659) {
                            c2639.m8139(enumC21815, i63, Integer.valueOf(iM18799));
                        } else {
                            c2639.m8139(enumC21815, i63, Long.valueOf(iM18799));
                        }
                        enumC21815Arr = enumC21815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 23:
                        bitSet = bitSet7;
                        num = num3;
                        c2639.m8134(enumC21815, bArr4[i22 + 1] & 255, bArr4[i22 + 2] & 255, bArr4[i22 + 3]);
                        enumC21815Arr = enumC21815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 24:
                        bitSet = bitSet7;
                        num = num3;
                        int i64 = bArr4[i22 + 1];
                        c2639.m8134(enumC21815, i64 & 15, (i64 & 255) >> 4, m18794(i22 + 2, bArr4));
                        enumC21815Arr = enumC21815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 25:
                        bitSet = bitSet7;
                        num = num3;
                        int i65 = bArr4[i22 + 1] & 255;
                        int iM18777 = m18774(i22 + 2, bArr4);
                        if (enumC21815 == EnumC21815.f70720) {
                            c2639.m8139(enumC21815, i65, Integer.valueOf(iM18777));
                        } else {
                            c2639.m8139(enumC21815, i65, Long.valueOf(iM18777));
                        }
                        enumC21815Arr = enumC21815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 26:
                        bitSet = bitSet7;
                        num = num3;
                        c2639.m8139(enumC21815, bArr4[i22 + 1] & 255, Long.valueOf((((long) m18789(i22 + 4, bArr4)) << 16) | ((long) m18789(i22 + 2, bArr4)) | (((long) m18789(i22 + 6, bArr4)) << 32) | (((long) m18789(i22 + 8, bArr4)) << 48)));
                        enumC21815Arr = enumC21815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                }
                BitSet bitSet9 = bitSet2;
                iNextSetBit = bitSet9.nextSetBit(i3 + 1);
                num3 = num;
                bitSet8 = bitSet9;
                bitSet7 = bitSet;
                enumC21815Arr2 = enumC21815Arr;
                it = it;
            }
            bitSet = bitSet7;
            num = num3;
            enumC21815Arr = enumC21815Arr2;
            i3 = iNextSetBit;
            bitSet2 = bitSet8;
            BitSet bitSet10 = bitSet2;
            iNextSetBit = bitSet10.nextSetBit(i3 + 1);
            num3 = num;
            bitSet8 = bitSet10;
            bitSet7 = bitSet;
            enumC21815Arr2 = enumC21815Arr;
            it = it;
        }
        Iterator it2 = it;
        while (num3 != null) {
            c2639.m8130((C14388) treeMap.get(num3));
            if (!it2.hasNext()) {
                return;
            } else {
                num3 = (Integer) it2.next();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C10860 m18780(int i) {
        ByteBuffer byteBuffer = this.f23542;
        byteBuffer.position(i * 4);
        int i2 = byteBuffer.getInt();
        ByteBuffer byteBuffer2 = this.f23563;
        byteBuffer2.position(i2);
        int iM18790 = m18790(byteBuffer2);
        Object[] objArr = new Object[iM18790];
        for (int i3 = 0; i3 < iM18790; i3++) {
            objArr[i3] = m18778(byteBuffer2);
        }
        Object[] objArrCopyOfRange = iM18790 > 3 ? Arrays.copyOfRange(objArr, 3, iM18790) : new Object[0];
        String.format("call_site_%d", Integer.valueOf(i));
        return new C10860((C4902) objArr[0], (String) objArr[1], (C14076) objArr[2], objArrCopyOfRange);
    }
}
