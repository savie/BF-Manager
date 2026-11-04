package l;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.᩸۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PE */
/* JADX INFO: loaded from: classes.dex */
public final class C22832 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final long f74002;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f74003;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final boolean f74004;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Class f74005;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final AbstractC10897 f74006;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final boolean f74007;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final long f74008;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final boolean f74009;

    static {
        Unsafe unsafeM51515 = m51515();
        f74003 = unsafeM51515;
        f74005 = C7191.m19765();
        boolean zM51534 = m51534(Long.TYPE);
        boolean zM51535 = m51534(Integer.TYPE);
        AbstractC10897 c22086 = null;
        if (unsafeM51515 != null) {
            if (!C7191.m19766()) {
                c22086 = new C22086(unsafeM51515);
            } else if (zM51534) {
                c22086 = new C4932(unsafeM51515);
            } else if (zM51535) {
                c22086 = new C13684(unsafeM51515);
            }
        }
        f74006 = c22086;
        f74009 = c22086 == null ? false : c22086.mo15128();
        f74004 = c22086 == null ? false : c22086.mo27657();
        f74008 = m51526(byte[].class);
        m51526(boolean[].class);
        m51516(boolean[].class);
        m51526(int[].class);
        m51516(int[].class);
        m51526(long[].class);
        m51516(long[].class);
        m51526(float[].class);
        m51516(float[].class);
        m51526(double[].class);
        m51516(double[].class);
        m51526(Object[].class);
        m51516(Object[].class);
        Field fieldM51528 = m51528();
        f74002 = (fieldM51528 == null || c22086 == null) ? -1L : c22086.m27662(fieldM51528);
        f74007 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m51532() {
        return f74004;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m51523() {
        return f74009;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m51501(Class cls) {
        try {
            return f74003.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m51527(Field field) {
        return f74006.m27662(field);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m51526(Class cls) {
        if (f74004) {
            return f74006.m27653(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m51516(Class cls) {
        if (f74004) {
            f74006.m27661(cls);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte m51498(long j, Object obj) {
        return (byte) ((f74006.m27660((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m51514(long j, Object obj) {
        return f74006.m27660(j, obj);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m51517(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM27660 = f74006.m27660(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m51504(((255 & b) << i) | (iM27660 & (~(255 << i))), j2, obj);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m51519(long j, Object obj) {
        return ((byte) ((f74006.m27660((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte m51525(long j, Object obj) {
        return (byte) ((f74006.m27660((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m51531(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m51504(((255 & b) << i) | (f74006.m27660(j2, obj) & (~(255 << i))), j2, obj);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m51533(long j, Object obj) {
        return ((byte) ((f74006.m27660((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51504(int i, long j, Object obj) {
        f74006.m27654(i, j, obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m51496(long j, Object obj) {
        return f74006.m27659(j, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51510(Object obj, long j, long j2) {
        f74006.m27656(obj, j, j2);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m51524(long j, Object obj) {
        return f74006.mo15125(j, obj);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m51518(Object obj, long j, boolean z) {
        f74006.mo15124(obj, j, z);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static float m51521(long j, Object obj) {
        return f74006.mo15129(j, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51509(Object obj, long j, float f) {
        f74006.mo15123(obj, j, f);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static double m51522(long j, Object obj) {
        return f74006.mo15126(j, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51508(Object obj, long j, double d) {
        f74006.mo15122(obj, j, d);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m51520(long j, Object obj) {
        return f74006.m27658(j, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51505(long j, Object obj, Object obj2) {
        f74006.m27655(j, obj, obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte m51499(long j, byte[] bArr) {
        return f74006.mo15127(f74008 + j, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51513(byte[] bArr, long j, byte b) {
        f74006.mo15121((Object) bArr, f74008 + j, b);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51506(long j, byte[] bArr, long j2, long j3) {
        f74006.mo15120(j, bArr, j2, j3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte m51497(long j) {
        return f74006.mo15118(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m51500(ByteBuffer byteBuffer) {
        return f74006.m27659(f74002, byteBuffer);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m51502(Field field) {
        return f74006.mo15119(field);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Unsafe m51515() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C6973());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m51534(Class cls) {
        if (!C7191.m19766()) {
            return false;
        }
        try {
            Class cls2 = f74005;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Field m51528() {
        Field declaredField;
        Field declaredField2;
        if (C7191.m19766()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51511(Object obj, long j, boolean z) {
        m51517(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m51530(Object obj, long j, boolean z) {
        m51531(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51512(Throwable th) {
        Logger.getLogger(C22832.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }
}
