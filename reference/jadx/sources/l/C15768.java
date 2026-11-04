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

/* JADX INFO: renamed from: l.ܶ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: T2R9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15768 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f51344 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C20528 f51346 = new C20528(5);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C20528 f51345 = new C20528(5);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m37704(int i, final byte[] bArr) {
        if (i <= 131072) {
            return m37703(0, i, bArr);
        }
        C6178 c6178 = new C6178();
        c6178.mo17812(10847);
        c6178.writeInt(i);
        ArrayList arrayList = new ArrayList((i / 10847) + 1);
        final int i2 = 0;
        while (i > 0) {
            final int iMin = Math.min(i, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
            arrayList.add(new Callable() { // from class: l.ܽ֫ܺ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C15768.m37703(i2, iMin, bArr);
                }
            });
            i2 += iMin;
            i -= iMin;
        }
        try {
            List listInvokeAll = C5261.f18537.invokeAll(arrayList);
            c6178.mo17812(listInvokeAll.size());
            Iterator it = listInvokeAll.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) ((Future) it.next()).get();
                c6178.m17809(bArr2.length);
                c6178.write(bArr2, 0, bArr2.length);
            }
            return c6178.m17796();
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
    public static byte[] m37705(String str) {
        C9982 c9982M37701 = m37701();
        C20528 c20528 = f51345;
        byte[] bArr = (byte[]) c20528.m47061();
        if (bArr == null) {
            bArr = new byte[8192];
        }
        try {
            C6527 c6527 = new C6527(bArr, new GZIPOutputStream(c9982M37701));
            try {
                C21443.m48762(c6527, str);
                c6527.close();
                byte[] bArrCopyOf = Arrays.copyOf(c9982M37701.f32079, c9982M37701.f32081);
                m37702(c9982M37701);
                c20528.m47060(bArr);
                return bArrCopyOf;
            } catch (Throwable th) {
                try {
                    c6527.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            m37702(c9982M37701);
            c20528.m47060(bArr);
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m37706(byte[] bArr, int i) {
        C9982 c9982M37701 = m37701();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(c9982M37701);
            try {
                gZIPOutputStream.write(bArr, 0, i);
                gZIPOutputStream.close();
                byte[] bArrCopyOf = Arrays.copyOf(c9982M37701.f32079, c9982M37701.f32081);
                m37702(c9982M37701);
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
            m37702(c9982M37701);
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m37703(int i, int i2, byte[] bArr) {
        C9982 c9982M37701 = m37701();
        try {
            C14729 c14729 = new C14729(c9982M37701);
            try {
                c14729.write(bArr, i, i2);
                c14729.close();
                byte[] bArrCopyOf = Arrays.copyOf(c9982M37701.f32079, c9982M37701.f32081);
                m37702(c9982M37701);
                return bArrCopyOf;
            } catch (Throwable th) {
                try {
                    c14729.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            m37702(c9982M37701);
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m37700(byte[] bArr) {
        int length = bArr.length;
        C9982 c9982M37701 = m37701();
        try {
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr, 0, length));
                try {
                    C5125.m15496(gZIPInputStream, c9982M37701);
                    String str = new String(c9982M37701.f32079, 0, c9982M37701.f32081, StandardCharsets.UTF_8);
                    gZIPInputStream.close();
                    m37702(c9982M37701);
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
            m37702(c9982M37701);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m37707(byte[] bArr, int i) {
        C9982 c9982M37701 = m37701();
        try {
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr, 0, i));
                try {
                    C5125.m15496(gZIPInputStream, c9982M37701);
                    byte[] bArrCopyOf = Arrays.copyOf(c9982M37701.f32079, c9982M37701.f32081);
                    gZIPInputStream.close();
                    m37702(c9982M37701);
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
            m37702(c9982M37701);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9982 m37701() {
        C9982 c9982 = (C9982) f51346.m47061();
        return c9982 == null ? new C9982() : c9982;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37702(C9982 c9982) {
        if (c9982.f32079.length < 2097152) {
            c9982.m25824();
            f51346.m47060(c9982);
        }
    }
}
