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

/* JADX INFO: renamed from: l.᩻ۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85A3 */
/* JADX INFO: loaded from: classes.dex */
public final class C24738 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C24912[] f80092;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C24912 f80093;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C21928 f80094;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C24738 f80095;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24912 f80096;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C24912 f80097;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f80098;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f80099;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C24912 f80100;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21928 f80101;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C24912 f80102;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C24912 f80103;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f80104;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21928 f80105;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C21928 f80106;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C12977 f80107;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21928 f80108;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f80109;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15960[] f80110;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C24912 f80111;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C21928 f80112;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C21928[] f80113;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24912 f80114;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C24912 f80115;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C24912 f80116;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f80117;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C4774 f80118;

    public C24738(int i) {
        this.f80095 = this;
        this.f80109 = false;
        this.f80118 = new C4774(this);
        this.f80107 = new C12977(this);
        C21928 c21928 = new C21928(this, EnumC15214.TYPE_STRING_ID_ITEM);
        this.f80094 = c21928;
        C21928 c21929 = new C21928(this, EnumC15214.TYPE_TYPE_ID_ITEM);
        this.f80112 = c21929;
        C21928 c219210 = new C21928(this, EnumC15214.TYPE_PROTO_ID_ITEM);
        this.f80106 = c219210;
        C21928 c219211 = new C21928(this, EnumC15214.TYPE_FIELD_ID_ITEM);
        this.f80101 = c219211;
        C21928 c219212 = new C21928(this, EnumC15214.TYPE_METHOD_ID_ITEM);
        this.f80108 = c219212;
        C11311 c11311 = new C11311(this, this, EnumC15214.TYPE_CLASS_DEF_ITEM);
        this.f80105 = c11311;
        C24912 c24912 = new C24912(this, EnumC15214.TYPE_TYPE_LIST);
        this.f80102 = c24912;
        C24912 c24913 = new C24912(this, EnumC15214.TYPE_ANNOTATION_SET_REF_LIST);
        this.f80114 = c24913;
        C24912 c24914 = new C24912(this, EnumC15214.TYPE_ANNOTATION_SET_ITEM);
        this.f80100 = c24914;
        C24912 c24915 = new C24912(this, EnumC15214.TYPE_CLASS_DATA_ITEM);
        this.f80111 = c24915;
        C24912 c24916 = new C24912(this, EnumC15214.TYPE_CODE_ITEM);
        this.f80103 = c24916;
        C24912 c24917 = new C24912(this, EnumC15214.TYPE_STRING_DATA_ITEM);
        this.f80116 = c24917;
        C24912 c24918 = new C24912(this, EnumC15214.TYPE_DEBUG_INFO_ITEM);
        this.f80097 = c24918;
        C24912 c24919 = new C24912(this, EnumC15214.TYPE_ANNOTATION_ITEM);
        this.f80115 = c24919;
        C24912 c249110 = new C24912(this, EnumC15214.TYPE_ENCODED_ARRAY_ITEM);
        this.f80093 = c249110;
        C24912 c249111 = new C24912(this, EnumC15214.TYPE_ANNOTATIONS_DIRECTORY_ITEM);
        this.f80096 = c249111;
        this.f80099 = true;
        this.f80110 = new AbstractC15960[]{c21928, c21929, c219210, c219211, c219212, c11311, c24912, c24913, c24914, c24915, c24916, c249111, c24917, c24918, c24919, c249110, null, null};
        this.f80113 = new C21928[]{c21928, c21929, c219210, c219211, c219212, c11311};
        this.f80092 = new C24912[]{c24913, c24914, c24916, c249111, c24912, c24917, c24919, c249110, c24915, c24918};
    }

    public C24738(InputStream inputStream) throws IOException {
        boolean z;
        C4028 c4028;
        C17452 c17452;
        C4028 c4029;
        this(0);
        InputStream bufferedInputStream = !inputStream.markSupported() ? new BufferedInputStream(inputStream) : inputStream;
        bufferedInputStream.mark(8);
        byte[] bArrM48331 = C21182.m48331(bufferedInputStream, 8);
        bufferedInputStream.reset();
        try {
            this.f80109 = false;
            boolean zEquals = Arrays.equals(bArrM48331, C4774.f16751);
            byte[] bArr = C11485.f36127;
            byte[] bArr2 = C11485.f36126;
            if (zEquals || Arrays.equals(bArrM48331, C4774.f16752)) {
                z = true;
            } else {
                if (Arrays.equals(bArrM48331, bArr2) || Arrays.equals(bArrM48331, bArr)) {
                    this.f80109 = true;
                }
                z = false;
            }
            if (this.f80109) {
                C4028 c40210 = new C4028(C21182.m48331(bufferedInputStream, 40));
                byte[] bArrM13001 = c40210.m13001(8);
                if (!Arrays.equals(bArr2, bArrM13001) && !Arrays.equals(bArr, bArrM13001)) {
                    throw new RuntimeException("The magic value is not one of the expected values");
                }
                int iM12995 = c40210.m12995();
                int iM12996 = c40210.m12995();
                int iM12997 = c40210.m12995();
                int iM12998 = c40210.m12995();
                c40210.m12995();
                c40210.m12995();
                c40210.m12995();
                c40210.m12995();
                int i = (iM12997 - iM12995) - iM12996;
                if (i < 0) {
                    throw new C14468("Unexpected placement of the odex dependency data", null);
                }
                if (iM12995 > 40) {
                    C21182.m48331(bufferedInputStream, iM12995 - 40);
                }
                c4028 = new C4028(C21182.m48331(bufferedInputStream, iM12996));
                if (i > 0) {
                    C21182.m48331(bufferedInputStream, i);
                }
                new C1791(new C4028(C21182.m48331(bufferedInputStream, iM12998)));
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
                c4028 = new C4028(byteArrayOutputStream.toByteArray());
            } else {
                StringBuilder sb = new StringBuilder("bad magic value:");
                for (int i3 = 0; i3 < 8; i3++) {
                    sb.append(" ");
                    sb.append(C14301.m34740(bArrM48331[i3]));
                }
                throw new RuntimeException(sb.toString());
            }
            bufferedInputStream.close();
            C17452 c17453 = new C17452();
            this.f80118.m27352(c4028, 0, c17453);
            c4028.m12996(c17453.m40950(EnumC15214.TYPE_MAP_LIST));
            this.f80107.m27352(c4028, 0, c17453);
            C4028 c40211 = c4028;
            C17452 c17454 = c17453;
            AbstractC15960[] abstractC15960Arr = {this.f80116, this.f80094, this.f80112, this.f80102, this.f80106, this.f80101, this.f80108, this.f80115, this.f80100, this.f80114, this.f80096, this.f80097, this.f80103, this.f80111, this.f80093, this.f80105};
            int i4 = 0;
            while (i4 < 16) {
                AbstractC15960 abstractC15960 = abstractC15960Arr[i4];
                if (abstractC15960 == null) {
                    c4029 = c40211;
                    c17452 = c17454;
                } else {
                    EnumC15214 enumC15214 = abstractC15960.f51830;
                    c17452 = c17454;
                    int iM40950 = c17452.m40950(enumC15214);
                    if (iM40950 > 0) {
                        int iM40954 = c17452.m40954(enumC15214);
                        c4029 = c40211;
                        c4029.m12996(iM40950);
                        ArrayList arrayList = abstractC15960.f51828;
                        arrayList.ensureCapacity(iM40954);
                        for (int size = arrayList.size(); size < iM40954; size++) {
                            arrayList.add(null);
                        }
                        c4029.m12993(enumC15214.f49669);
                        abstractC15960.f51831 = c4029.m12992();
                        abstractC15960.mo38080(c4029, c17452);
                    } else {
                        c4029 = c40211;
                    }
                }
                i4++;
                c17454 = c17452;
                c40211 = c4029;
            }
        } catch (Throwable th) {
            bufferedInputStream.close();
            throw th;
        }
    }

    public C24738() {
        this(0);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m55245() {
        return this.f80099;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m55243() {
        return this.f80104;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m55246() {
        return this.f80117;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m55241() {
        return this.f80098;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC15960[] m55247() {
        AbstractC15960[] abstractC15960Arr = this.f80110;
        int i = 0;
        for (AbstractC15960 abstractC15960 : abstractC15960Arr) {
            if (abstractC15960 != null && abstractC15960.f51828.size() > 0) {
                i++;
            }
        }
        AbstractC15960[] abstractC15960Arr2 = new AbstractC15960[i];
        int i2 = 0;
        for (AbstractC15960 abstractC15961 : abstractC15960Arr) {
            if (abstractC15961 != null && abstractC15961.f51828.size() > 0) {
                abstractC15960Arr2[i2] = abstractC15961;
                i2++;
            }
        }
        Arrays.sort(abstractC15960Arr2, new C5346());
        return abstractC15960Arr2;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m55244() {
        int iM27354 = this.f80118.m27354(0, 0);
        C21928[] c21928Arr = this.f80113;
        int length = c21928Arr.length;
        C24912[] c24912Arr = this.f80092;
        int length2 = length + c24912Arr.length;
        AbstractC15960[] abstractC15960Arr = new AbstractC15960[length2];
        System.arraycopy(c21928Arr, 0, abstractC15960Arr, 0, c21928Arr.length);
        System.arraycopy(c24912Arr, 0, abstractC15960Arr, c21928Arr.length, c24912Arr.length);
        int i = 0;
        while (i < length2 && abstractC15960Arr[i].f51830.m36561()) {
            AbstractC15960 abstractC15960 = abstractC15960Arr[i];
            Collections.sort(abstractC15960.f51828);
            iM27354 = abstractC15960.mo28583(iM27354);
            i++;
        }
        this.f80098 = iM27354;
        while (i < length2) {
            iM27354 = abstractC15960Arr[i].mo28583(iM27354);
            i++;
        }
        int i2 = EnumC15214.TYPE_MAP_LIST.f49669 - 1;
        int iM27355 = this.f80107.m27354((iM27354 + i2) & (~i2), 0);
        this.f80104 = iM27355;
        this.f80117 = iM27355 - this.f80098;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55242(C24166 c24166) {
        this.f80118.m27355(c24166);
        C21928[] c21928Arr = this.f80113;
        int length = c21928Arr.length;
        C24912[] c24912Arr = this.f80092;
        int length2 = length + c24912Arr.length;
        AbstractC15960[] abstractC15960Arr = new AbstractC15960[length2];
        System.arraycopy(c21928Arr, 0, abstractC15960Arr, 0, c21928Arr.length);
        System.arraycopy(c24912Arr, 0, abstractC15960Arr, c21928Arr.length, c24912Arr.length);
        for (int i = 0; i < length2; i++) {
            AbstractC15960 abstractC15960 = abstractC15960Arr[i];
            abstractC15960.getClass();
            EnumC15214 enumC15214 = abstractC15960.f51830;
            String str = enumC15214.f49668;
            for (AbstractC10739 abstractC10739 : abstractC15960.f51828) {
                c24166.m54131(enumC15214.f49669);
                abstractC10739.m27355(c24166);
            }
        }
        C12977 c12977 = this.f80107;
        c12977.getClass();
        c24166.m54131(EnumC15214.TYPE_MAP_LIST.f49669);
        c12977.m27355(c24166);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55240(byte[] bArr) {
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
