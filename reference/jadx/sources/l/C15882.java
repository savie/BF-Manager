package l;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ܺۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PE */
/* JADX INFO: loaded from: classes4.dex */
public final class C15882 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Class f51454;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final boolean f51455;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final long f51456;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final boolean f51457;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final boolean f51458;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Unsafe f51459;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final long f51460;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final AbstractC20820 f51461;

    static {
        Unsafe unsafeM37786 = m37786();
        f51459 = unsafeM37786;
        f51454 = C19491.m44545();
        boolean zM37764 = m37764(Long.TYPE);
        boolean zM37765 = m37764(Integer.TYPE);
        AbstractC20820 c7414 = null;
        if (unsafeM37786 != null) {
            if (!C19491.m44546()) {
                c7414 = new C7414(unsafeM37786);
            } else if (zM37764) {
                c7414 = new C10237(unsafeM37786);
            } else if (zM37765) {
                c7414 = new C8826(unsafeM37786);
            }
        }
        f51461 = c7414;
        f51455 = c7414 == null ? false : c7414.mo19849();
        f51458 = c7414 == null ? false : c7414.mo19845();
        f51460 = m37793(byte[].class);
        m37793(boolean[].class);
        m37787(boolean[].class);
        m37793(int[].class);
        m37787(int[].class);
        m37793(long[].class);
        m37787(long[].class);
        m37793(float[].class);
        m37787(float[].class);
        m37793(double[].class);
        m37787(double[].class);
        m37793(Object[].class);
        m37787(Object[].class);
        Field fieldM37795 = m37795();
        f51456 = (fieldM37795 == null || c7414 == null) ? -1L : c7414.m46825(fieldM37795);
        f51457 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m37762() {
        return f51458;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m37783() {
        return f51455;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m37770(Class cls) {
        try {
            return f51459.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m37794(Field field) {
        return f51461.m46825(field);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m37793(Class cls) {
        if (f51458) {
            return f51461.m46819(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m37787(Class cls) {
        if (f51458) {
            f51461.m46824(cls);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m37761(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m37773(((255 & b) << i) | (f51461.m46823(j2, obj) & (~(255 << i))), j2, obj);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m37763(long j, Object obj) {
        return ((byte) ((f51461.m46823((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte m37767(long j, Object obj) {
        return (byte) ((f51461.m46823((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m37788(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM46823 = f51461.m46823(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m37773(((255 & b) << i) | (iM46823 & (~(255 << i))), j2, obj);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m37790(long j, Object obj) {
        return ((byte) ((f51461.m46823((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static int m37791(long j, Object obj) {
        return f51461.m46823(j, obj);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte m37792(long j, Object obj) {
        return (byte) ((f51461.m46823((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37773(int i, long j, Object obj) {
        f51461.m46820(i, j, obj);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static long m37765(long j, Object obj) {
        return f51461.m46826(j, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37779(Object obj, long j, long j2) {
        f51461.m46822(obj, j, j2);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m37784(long j, Object obj) {
        return f51461.mo19846(j, obj);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m37789(Object obj, long j, boolean z) {
        f51461.mo19844(obj, j, z);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static float m37760(long j, Object obj) {
        return f51461.mo19837(j, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37778(Object obj, long j, float f) {
        f51461.mo19843(obj, j, f);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static double m37798(long j, Object obj) {
        return f51461.mo19847(j, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37777(Object obj, long j, double d) {
        f51461.mo19842(obj, j, d);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static Object m37785(long j, Object obj) {
        return f51461.m46818(j, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37774(long j, Object obj, Object obj2) {
        f51461.m46821(j, obj, obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte m37768(long j, byte[] bArr) {
        return f51461.mo19848(f51460 + j, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37782(byte[] bArr, long j, byte b) {
        f51461.mo19841((Object) bArr, f51460 + j, b);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37775(long j, byte[] bArr, long j2, long j3) {
        f51461.mo19840(j, bArr, j2, j3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte m37766(long j) {
        return f51461.mo19838(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m37769(ByteBuffer byteBuffer) {
        return f51461.m46826(f51456, byteBuffer);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m37771(Field field) {
        return f51461.mo19839(field);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Unsafe m37786() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C19409());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m37764(Class cls) {
        if (!C19491.m44546()) {
            return false;
        }
        try {
            Class cls2 = f51454;
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Field m37795() {
        Field declaredField;
        Field declaredField2;
        if (C19491.m44546()) {
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
    public static void m37780(Object obj, long j, boolean z) {
        m37788(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m37797(Object obj, long j, boolean z) {
        m37761(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37781(Throwable th) {
        Logger.getLogger(C15882.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }
}
