package l;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: l.۫֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 85A3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12063 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f40346;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C12538 f40347;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12538 f40348;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C12538 f40349;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12538 f40350;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C12538 f40351;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C19594 f40352;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f40353;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C19594 f40354;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C12538 f40355;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f40356;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C12538 f40357;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f40358;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C12538 f40359;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12538 f40360;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C16066 f40361;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f40362;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12538[] f40363;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC11127[] f40364;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C19594 f40365;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C12538 f40366;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C19594 f40367;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19594[] f40368;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12063 f40369;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19594 f40370;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C19594 f40371;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C8305 f40372;

    public C12063(int i) {
        this.f40369 = this;
        this.f40346 = false;
        this.f40372 = new C8305(this);
        this.f40361 = new C16066(this);
        C19594 c19594 = new C19594(this, EnumC21004.TYPE_STRING_ID_ITEM);
        this.f40354 = c19594;
        C19594 c19595 = new C19594(this, EnumC21004.TYPE_TYPE_ID_ITEM);
        this.f40367 = c19595;
        C19594 c19596 = new C19594(this, EnumC21004.TYPE_PROTO_ID_ITEM);
        this.f40365 = c19596;
        C19594 c19597 = new C19594(this, EnumC21004.TYPE_FIELD_ID_ITEM);
        this.f40352 = c19597;
        C19594 c19598 = new C19594(this, EnumC21004.TYPE_METHOD_ID_ITEM);
        this.f40370 = c19598;
        C16296 c16296 = new C16296(this, this, EnumC21004.TYPE_CLASS_DEF_ITEM);
        this.f40371 = c16296;
        C12538 c12538 = new C12538(this, EnumC21004.TYPE_TYPE_LIST);
        this.f40355 = c12538;
        C12538 c12539 = new C12538(this, EnumC21004.TYPE_ANNOTATION_SET_REF_LIST);
        this.f40360 = c12539;
        C12538 c125310 = new C12538(this, EnumC21004.TYPE_ANNOTATION_SET_ITEM);
        this.f40357 = c125310;
        C12538 c125311 = new C12538(this, EnumC21004.TYPE_CLASS_DATA_ITEM);
        this.f40351 = c125311;
        C12538 c125312 = new C12538(this, EnumC21004.TYPE_CODE_ITEM);
        this.f40347 = c125312;
        C12538 c125313 = new C12538(this, EnumC21004.TYPE_STRING_DATA_ITEM);
        this.f40366 = c125313;
        C12538 c125314 = new C12538(this, EnumC21004.TYPE_DEBUG_INFO_ITEM);
        this.f40359 = c125314;
        C12538 c125315 = new C12538(this, EnumC21004.TYPE_ANNOTATION_ITEM);
        this.f40348 = c125315;
        C12538 c125316 = new C12538(this, EnumC21004.TYPE_ENCODED_ARRAY_ITEM);
        this.f40349 = c125316;
        C12538 c125317 = new C12538(this, EnumC21004.TYPE_ANNOTATIONS_DIRECTORY_ITEM);
        this.f40350 = c125317;
        this.f40358 = true;
        this.f40364 = new AbstractC11127[]{c19594, c19595, c19596, c19597, c19598, c16296, c12538, c12539, c125310, c125311, c125312, c125317, c125313, c125314, c125315, c125316, null, null};
        this.f40368 = new C19594[]{c19594, c19595, c19596, c19597, c19598, c16296};
        this.f40363 = new C12538[]{c12539, c125310, c125312, c125317, c12538, c125313, c125315, c125316, c125311, c125314};
    }

    public C12063(InputStream inputStream) throws IOException {
        boolean z;
        C13825 c13825;
        C6187 c6187;
        C13825 c13826;
        this(0);
        InputStream bufferedInputStream = !inputStream.markSupported() ? new BufferedInputStream(inputStream) : inputStream;
        bufferedInputStream.mark(8);
        byte[] bArrM7912 = C2534.m7912(bufferedInputStream, 8);
        bufferedInputStream.reset();
        try {
            this.f40346 = false;
            boolean zEquals = Arrays.equals(bArrM7912, C8305.f28826);
            byte[] bArr = C16771.f53679;
            byte[] bArr2 = C16771.f53678;
            if (zEquals || Arrays.equals(bArrM7912, C8305.f28825)) {
                z = true;
            } else {
                if (Arrays.equals(bArrM7912, bArr2) || Arrays.equals(bArrM7912, bArr)) {
                    this.f40346 = true;
                }
                z = false;
            }
            if (this.f40346) {
                C13825 c13827 = new C13825(C2534.m7912(bufferedInputStream, 40));
                byte[] bArrM33646 = c13827.m33646(8);
                if (!Arrays.equals(bArr2, bArrM33646) && !Arrays.equals(bArr, bArrM33646)) {
                    throw new RuntimeException("The magic value is not one of the expected values");
                }
                int iM33642 = c13827.m33642();
                int iM33643 = c13827.m33642();
                int iM33644 = c13827.m33642();
                int iM33645 = c13827.m33642();
                c13827.m33642();
                c13827.m33642();
                c13827.m33642();
                c13827.m33642();
                int i = (iM33644 - iM33642) - iM33643;
                if (i < 0) {
                    throw new C11708("Unexpected placement of the odex dependency data", null);
                }
                if (iM33642 > 40) {
                    C2534.m7912(bufferedInputStream, iM33642 - 40);
                }
                c13825 = new C13825(C2534.m7912(bufferedInputStream, iM33643));
                if (i > 0) {
                    C2534.m7912(bufferedInputStream, i);
                }
                new C0542(new C13825(C2534.m7912(bufferedInputStream, iM33645)));
            } else if (z) {
                byte[] bArr3 = new byte[10240];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int i2 = bufferedInputStream.read(bArr3);
                    if (i2 == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr3, 0, i2);
                    }
                }
                c13825 = new C13825(byteArrayOutputStream.toByteArray());
            } else {
                StringBuilder sb = new StringBuilder("bad magic value:");
                for (int i3 = 0; i3 < 8; i3++) {
                    sb.append(" ");
                    sb.append(C3335.m9929(bArrM7912[i3]));
                }
                throw new RuntimeException(sb.toString());
            }
            bufferedInputStream.close();
            C6187 c6188 = new C6187();
            this.f40372.m23324(c13825, 0, c6188);
            c13825.m33643(c6188.m17182(EnumC21004.TYPE_MAP_LIST));
            this.f40361.m23324(c13825, 0, c6188);
            C13825 c13828 = c13825;
            C6187 c6189 = c6188;
            AbstractC11127[] abstractC11127Arr = {this.f40366, this.f40354, this.f40367, this.f40355, this.f40365, this.f40352, this.f40370, this.f40348, this.f40357, this.f40360, this.f40350, this.f40359, this.f40347, this.f40351, this.f40349, this.f40371};
            int i4 = 0;
            while (i4 < 16) {
                AbstractC11127 abstractC11127 = abstractC11127Arr[i4];
                if (abstractC11127 == null) {
                    c13826 = c13828;
                    c6187 = c6189;
                } else {
                    EnumC21004 enumC21004 = abstractC11127.f37762;
                    c6187 = c6189;
                    int iM17182 = c6187.m17182(enumC21004);
                    if (iM17182 > 0) {
                        int iM17186 = c6187.m17186(enumC21004);
                        c13826 = c13828;
                        c13826.m33643(iM17182);
                        ArrayList arrayList = abstractC11127.f37761;
                        arrayList.ensureCapacity(iM17186);
                        for (int size = arrayList.size(); size < iM17186; size++) {
                            arrayList.add(null);
                        }
                        c13826.m33640(enumC21004.f68396);
                        abstractC11127.f37758 = c13826.m33639();
                        abstractC11127.mo28061(c13826, c6187);
                    } else {
                        c13826 = c13828;
                    }
                }
                i4++;
                c6189 = c6187;
                c13828 = c13826;
            }
        } catch (Throwable th) {
            bufferedInputStream.close();
            throw th;
        }
    }

    public C12063() {
        this(0);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m29978() {
        return this.f40358;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m29979() {
        return this.f40362;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m29980() {
        return this.f40353;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29976() {
        return this.f40356;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC11127[] m29975() {
        AbstractC11127[] abstractC11127Arr = this.f40364;
        int i = 0;
        for (AbstractC11127 abstractC11127 : abstractC11127Arr) {
            if (abstractC11127 != null && abstractC11127.f37761.size() > 0) {
                i++;
            }
        }
        AbstractC11127[] abstractC11127Arr2 = new AbstractC11127[i];
        int i2 = 0;
        for (AbstractC11127 abstractC11128 : abstractC11127Arr) {
            if (abstractC11128 != null && abstractC11128.f37761.size() > 0) {
                abstractC11127Arr2[i2] = abstractC11128;
                i2++;
            }
        }
        Arrays.sort(abstractC11127Arr2, new C19824());
        return abstractC11127Arr2;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m29981() {
        int iM23326 = this.f40372.m23326(0, 0);
        C19594[] c19594Arr = this.f40368;
        int length = c19594Arr.length;
        C12538[] c12538Arr = this.f40363;
        int length2 = length + c12538Arr.length;
        AbstractC11127[] abstractC11127Arr = new AbstractC11127[length2];
        System.arraycopy(c19594Arr, 0, abstractC11127Arr, 0, c19594Arr.length);
        System.arraycopy(c12538Arr, 0, abstractC11127Arr, c19594Arr.length, c12538Arr.length);
        int i = 0;
        while (i < length2 && abstractC11127Arr[i].f37762.m47164()) {
            AbstractC11127 abstractC11127 = abstractC11127Arr[i];
            Collections.sort(abstractC11127.f37761);
            iM23326 = abstractC11127.mo28058(iM23326);
            i++;
        }
        this.f40356 = iM23326;
        while (i < length2) {
            iM23326 = abstractC11127Arr[i].mo28058(iM23326);
            i++;
        }
        int i2 = EnumC21004.TYPE_MAP_LIST.f68396 - 1;
        int iM23327 = this.f40361.m23326((iM23326 + i2) & (~i2), 0);
        this.f40362 = iM23327;
        this.f40353 = iM23327 - this.f40356;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29977(C4651 c4651) {
        this.f40372.m23328(c4651);
        C19594[] c19594Arr = this.f40368;
        int length = c19594Arr.length;
        C12538[] c12538Arr = this.f40363;
        int length2 = length + c12538Arr.length;
        AbstractC11127[] abstractC11127Arr = new AbstractC11127[length2];
        System.arraycopy(c19594Arr, 0, abstractC11127Arr, 0, c19594Arr.length);
        System.arraycopy(c12538Arr, 0, abstractC11127Arr, c19594Arr.length, c12538Arr.length);
        for (int i = 0; i < length2; i++) {
            AbstractC11127 abstractC11127 = abstractC11127Arr[i];
            abstractC11127.getClass();
            EnumC21004 enumC21004 = abstractC11127.f37762;
            String str = enumC21004.f68397;
            for (AbstractC9011 abstractC9011 : abstractC11127.f37761) {
                c4651.m12835(enumC21004.f68396);
                abstractC9011.m23328(c4651);
            }
        }
        C16066 c16066 = this.f40361;
        c16066.getClass();
        c4651.m12835(EnumC21004.TYPE_MAP_LIST.f68396);
        c16066.m23328(c4651);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29974(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr, 32, bArr.length - 32);
            try {
                int iDigest = messageDigest.digest(bArr, 12, 20);
                if (iDigest == 20) {
                    return;
                }
                throw new RuntimeException("unexpected digest write: " + iDigest + " bytes");
            } catch (DigestException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }
}
