package l;

import android.text.SpannableStringBuilder;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.᩻ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public class C23805 {
    /* JADX INFO: renamed from: ۙ */
    public C23805 mo10239(String str) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ */
    public C23805 mo10240(String str, String str2) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10241(Object obj, String str) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10242(String str, String str2, String str3) {
        throw null;
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo6599() {
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m52459(String str) {
        return "target_not_mapped".equals(str) || "result_limit_reached".equals(str) || "scan_budget_exhausted".equals(str) || "relocation_page_budget_exhausted".equals(str) || "scan_space_exhausted".equals(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m52452(InputStream inputStream) {
        if (inputStream == null) {
            C23099.m51115("MD5Utils", "md5 stream is null");
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[8192];
            while (true) {
                int i = inputStream.read(bArr, 0, 8192);
                if (i > 0) {
                    messageDigest.update(bArr, 0, i);
                } else {
                    return C2761.m8426(messageDigest.digest());
                }
            }
        } catch (Throwable th) {
            C23099.m51111("MD5Utils", "md5 exception", th);
            C23099.m51115("MD5Utils", "md5 return null");
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52453(int i, int i2, byte[] bArr) {
        if (i2 < 0) {
            throw new IllegalArgumentException("lengths must be >= 0");
        }
        if (i2 > 0) {
            if (i < 0 || i >= bArr.length) {
                throw new ArrayIndexOutOfBoundsException(i);
            }
            int i3 = (i + i2) - 1;
            if (i3 < 0 || i3 >= bArr.length) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object[] m52456(int i, Object[] objArr) {
        if (i < objArr.length) {
            return objArr;
        }
        int length = objArr.length;
        while (length < i + 1) {
            length *= 2;
        }
        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length);
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        return objArr2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52454(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m52457(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19969 m52467(Object obj, Object obj2) {
        if (obj == null) {
            return null;
        }
        InterfaceC19969 interfaceC19969 = (InterfaceC19969) obj;
        C18557 c18557Mo42955 = interfaceC19969.mo42955();
        c18557Mo42955.f59041 = interfaceC19969.mo42958();
        c18557Mo42955.f59040 = (C18557) ((InterfaceC19969) obj2);
        int childCount = interfaceC19969.getChildCount();
        for (int i = 0; i < childCount; i++) {
            m52470((InterfaceC19969) c18557Mo42955, (Object) m52467(interfaceC19969.mo45257(i), obj));
        }
        return c18557Mo42955;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m52455(int i, byte[] bArr) {
        if (i < bArr.length) {
            return bArr;
        }
        int length = bArr.length;
        while (length < i + 1) {
            length *= 2;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m52458(int i, byte[] bArr) {
        if (C23756.f76860 == ByteOrder.BIG_ENDIAN) {
            return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        }
        return m52457(i, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18557 m52462() {
        return new C18557(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18557 m52466(InterfaceC12913 interfaceC12913) {
        return new C18557(interfaceC12913);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C17851 m52461(InterfaceC3739 interfaceC3739, InterfaceC12913 interfaceC12913, InterfaceC12913 interfaceC12914, C22085 c22085) {
        C17851 c17851 = new C17851();
        if (interfaceC12914 == null || (interfaceC12914.mo30180() < interfaceC12913.mo30180() && interfaceC12914.getType() != -1)) {
            interfaceC12914 = interfaceC12913;
        }
        c17851.f56538 = interfaceC3739;
        c17851.f56541 = interfaceC12913;
        c17851.f56539 = interfaceC12914;
        c17851.f56540 = c22085;
        return c17851;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18557 m52463(int i, String str) {
        return new C18557(new C12125(i, str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18557 m52464(int i, InterfaceC12913 interfaceC12913) {
        C12125 c12125 = new C12125(interfaceC12913);
        c12125.m30179(i);
        return new C18557(c12125);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m52469(C18557 c18557, InterfaceC12913 interfaceC12913, InterfaceC12913 interfaceC12914) {
        if (c18557 == null) {
            return;
        }
        int iMo30180 = interfaceC12913 != null ? interfaceC12913.mo30180() : 0;
        int iMo30181 = interfaceC12914 != null ? interfaceC12914.mo30180() : 0;
        c18557.mo42957(iMo30180);
        c18557.mo42959(iMo30181);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m52470(InterfaceC19969 interfaceC19969, Object obj) {
        if (interfaceC19969 == null || obj == null) {
            return;
        }
        interfaceC19969.mo45258((InterfaceC19969) obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object m52460(C18557 c18557, C18557 c18558) {
        boolean zMo41440 = c18557.mo41440();
        C18557 c18557Mo45257 = c18557;
        if (zMo41440) {
            int childCount = c18557.getChildCount();
            if (childCount == 1) {
                c18557Mo45257 = c18557;
                c18557Mo45257 = c18557.mo45257(0);
            } else if (childCount > 1) {
                throw new RuntimeException("more than one node as root (TODO: make exception hierarchy)");
            }
        }
        c18557Mo45257.mo45258(c18558);
        return c18557Mo45257;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19969 m52468(C18557 c18557) {
        if (c18557 == null || !c18557.mo41440()) {
            return c18557;
        }
        if (c18557.getChildCount() == 0) {
            return null;
        }
        if (c18557.getChildCount() != 1) {
            return c18557;
        }
        InterfaceC19969 interfaceC19969Mo45257 = c18557.mo45257(0);
        interfaceC19969Mo45257.mo42960((InterfaceC19969) null);
        interfaceC19969Mo45257.mo42953(-1);
        return interfaceC19969Mo45257;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18557 m52465(int i, InterfaceC12913 interfaceC12913, String str) {
        if (interfaceC12913 != null) {
            C12125 c12125 = new C12125(interfaceC12913);
            c12125.m30179(i);
            c12125.m30178(str);
            return new C18557(c12125);
        }
        return m52463(i, str);
    }
}
