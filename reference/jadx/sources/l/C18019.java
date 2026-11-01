package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: l.ᩳۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T2R9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18019 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f57618 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C19805 f57620 = new C19805(5);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C19805 f57619 = new C19805(5);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m41966(int i, final byte[] bArr) {
        if (i <= 131072) {
            return m41965(0, i, bArr);
        }
        C11018 c11018 = new C11018();
        c11018.mo24508(10847);
        c11018.writeInt(i);
        ArrayList arrayList = new ArrayList((i / 10847) + 1);
        final int i2 = 0;
        while (i > 0) {
            final int iMin = Math.min(i, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
            arrayList.add(new Callable() { // from class: l.᩸ۧ᩺
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C18019.m41965(i2, iMin, bArr);
                }
            });
            i2 += iMin;
            i -= iMin;
        }
        try {
            List listInvokeAll = C4716.f16633.invokeAll(arrayList);
            c11018.mo24508(listInvokeAll.size());
            Iterator it = listInvokeAll.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) ((Future) it.next()).get();
                c11018.m27775(bArr2.length);
                c11018.write(bArr2, 0, bArr2.length);
            }
            return c11018.m27773();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m41967(String str) {
        C19551 c19551M41963 = m41963();
        C19805 c19805 = f57619;
        byte[] bArr = (byte[]) c19805.m45009();
        if (bArr == null) {
            bArr = new byte[8192];
        }
        try {
            C12678 c12678 = new C12678(bArr, new GZIPOutputStream(c19551M41963));
            try {
                C23967.m52797(c12678, str);
                c12678.close();
                byte[] bArrCopyOf = Arrays.copyOf(c19551M41963.f62829, c19551M41963.f62830);
                m41964(c19551M41963);
                c19805.m45011(bArr);
                return bArrCopyOf;
            } catch (Throwable th) {
                try {
                    c12678.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            m41964(c19551M41963);
            c19805.m45011(bArr);
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m41968(byte[] bArr, int i) {
        C19551 c19551M41963 = m41963();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(c19551M41963);
            try {
                gZIPOutputStream.write(bArr, 0, i);
                gZIPOutputStream.close();
                byte[] bArrCopyOf = Arrays.copyOf(c19551M41963.f62829, c19551M41963.f62830);
                m41964(c19551M41963);
                return bArrCopyOf;
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            m41964(c19551M41963);
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m41965(int i, int i2, byte[] bArr) {
        C19551 c19551M41963 = m41963();
        try {
            C11267 c11267 = new C11267(c19551M41963);
            try {
                c11267.write(bArr, i, i2);
                c11267.close();
                byte[] bArrCopyOf = Arrays.copyOf(c19551M41963.f62829, c19551M41963.f62830);
                m41964(c19551M41963);
                return bArrCopyOf;
            } catch (Throwable th) {
                try {
                    c11267.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            m41964(c19551M41963);
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41962(byte[] bArr) {
        int length = bArr.length;
        C19551 c19551M41963 = m41963();
        try {
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr, 0, length));
                try {
                    C20010.m45301(gZIPInputStream, c19551M41963);
                    String str = new String(c19551M41963.f62829, 0, c19551M41963.f62830, StandardCharsets.UTF_8);
                    gZIPInputStream.close();
                    m41964(c19551M41963);
                    return str;
                } catch (Throwable th) {
                    try {
                        gZIPInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th3) {
            m41964(c19551M41963);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m41969(byte[] bArr, int i) {
        C19551 c19551M41963 = m41963();
        try {
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr, 0, i));
                try {
                    C20010.m45301(gZIPInputStream, c19551M41963);
                    byte[] bArrCopyOf = Arrays.copyOf(c19551M41963.f62829, c19551M41963.f62830);
                    gZIPInputStream.close();
                    m41964(c19551M41963);
                    return bArrCopyOf;
                } catch (Throwable th) {
                    try {
                        gZIPInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th3) {
            m41964(c19551M41963);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19551 m41963() {
        C19551 c19551 = (C19551) f57620.m45009();
        return c19551 == null ? new C19551() : c19551;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41964(C19551 c19551) {
        if (c19551.f62829.length < 2097152) {
            c19551.m44640();
            f57620.m45011(c19551);
        }
    }
}
