package l;

import android.util.Log;
import bin.mt.plus.Features2;
import com.alipay.sdk.m.t.e;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ᩴܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K1X4 */
/* JADX INFO: loaded from: classes5.dex */
public final class BinderC19940 extends AbstractBinderC25162 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC2041 f64134;

    public BinderC19940(ServiceC2041 serviceC2041) {
        this.f64134 = serviceC2041;
        attachInterface(this, "bin.mt.dstr.ipc.IDecryptorAidlInterface");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00ca A[Catch: all -> 0x00ce, TRY_LEAVE, TryCatch #0 {all -> 0x00ce, blocks: (B:19:0x00c4, B:21:0x00ca), top: B:42:0x00c4 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00ef A[Catch: Exception -> 0x0161, TryCatch #1 {Exception -> 0x0161, blocks: (B:7:0x0022, B:9:0x0040, B:11:0x004d, B:18:0x008c, B:22:0x00ce, B:24:0x00ef, B:25:0x00f2, B:28:0x0119, B:30:0x012d, B:29:0x012a, B:32:0x013b, B:33:0x014c, B:14:0x0077, B:34:0x014d, B:35:0x0154, B:36:0x0155, B:37:0x0160), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0119 A[Catch: Exception -> 0x0161, TryCatch #1 {Exception -> 0x0161, blocks: (B:7:0x0022, B:9:0x0040, B:11:0x004d, B:18:0x008c, B:22:0x00ce, B:24:0x00ef, B:25:0x00f2, B:28:0x0119, B:30:0x012d, B:29:0x012a, B:32:0x013b, B:33:0x014c, B:14:0x0077, B:34:0x014d, B:35:0x0154, B:36:0x0155, B:37:0x0160), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x012a A[Catch: Exception -> 0x0161, TryCatch #1 {Exception -> 0x0161, blocks: (B:7:0x0022, B:9:0x0040, B:11:0x004d, B:18:0x008c, B:22:0x00ce, B:24:0x00ef, B:25:0x00f2, B:28:0x0119, B:30:0x012d, B:29:0x012a, B:32:0x013b, B:33:0x014c, B:14:0x0077, B:34:0x014d, B:35:0x0154, B:36:0x0155, B:37:0x0160), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x013b A[Catch: Exception -> 0x0161, TryCatch #1 {Exception -> 0x0161, blocks: (B:7:0x0022, B:9:0x0040, B:11:0x004d, B:18:0x008c, B:22:0x00ce, B:24:0x00ef, B:25:0x00f2, B:28:0x0119, B:30:0x012d, B:29:0x012a, B:32:0x013b, B:33:0x014c, B:14:0x0077, B:34:0x014d, B:35:0x0154, B:36:0x0155, B:37:0x0160), top: B:44:0x0022 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x013b, please report this as an issue */
    @Override // l.InterfaceC16956
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo29468(String str, final boolean z, boolean z2, boolean z3) {
        String str2;
        int iInit;
        ClassLoader systemClassLoader;
        ServiceC2041 serviceC2041 = this.f64134;
        ClassLoader parent = null;
        serviceC2041.f6797 = null;
        if (serviceC2041.f6793) {
            serviceC2041.f6797 = new IllegalStateException("Decryptor session already loaded");
            return false;
        }
        ServiceC2041.m7033(serviceC2041, true);
        try {
            File canonicalFile = new File(serviceC2041.getCacheDir(), "decrypt").getCanonicalFile();
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile.equals(canonicalFile2)) {
                throw new IllegalArgumentException(C25272.m56409("Unsupported work dir: ", str));
            }
            File file = new File(canonicalFile2, "base.apk");
            if (!file.isFile()) {
                throw new IllegalArgumentException("Missing base.apk");
            }
            File file2 = new File(canonicalFile2, "lib");
            File file3 = new File(canonicalFile2, "opt");
            File file4 = new File(canonicalFile2, e.m);
            File file5 = new File(canonicalFile2, "tmp");
            File file6 = new File(canonicalFile2, "lib_abi");
            try {
                if (file6.isFile()) {
                    Charset charset = StandardCharsets.UTF_8;
                    String strTrim = C0147.m1309(file6).trim();
                    if (!strTrim.isEmpty()) {
                        str2 = strTrim;
                    }
                    C0147.m1312(file2);
                    C0147.m1312(file3);
                    C0147.m1312(file5);
                    C0147.m1312(new File(file4, "files"));
                    C0147.m1312(new File(file4, "cache"));
                    C0147.m1312(new File(file4, "code_cache"));
                    file.setReadOnly();
                    String path = file.getPath();
                    String path2 = file3.getPath();
                    String path3 = file2.getPath();
                    systemClassLoader = ClassLoader.getSystemClassLoader();
                    if (systemClassLoader != null) {
                        parent = systemClassLoader.getParent();
                    }
                    serviceC2041.f6798 = new C10090(path, path2, path3, parent);
                    serviceC2041.f6796 = new C19041(serviceC2041.getApplicationContext(), file, C4560.m14311(file.getPath()), serviceC2041.f6798, file2, file4, str2);
                    if (z2) {
                        C12481.m31018();
                    }
                    C13921 c13921 = ServiceC2041.f6787;
                    String packageName = serviceC2041.f6796.getPackageName();
                    String packageName2 = serviceC2041.getPackageName();
                    String canonicalPath = canonicalFile2.getCanonicalPath();
                    String strM44150 = serviceC2041.f6796.m44150();
                    c13921.getClass();
                    iInit = Features2.init(packageName, packageName2, canonicalPath, strM44150);
                    if (iInit == 0) {
                        throw new IllegalStateException("Native hook init failed: " + iInit);
                    }
                    if (z3) {
                        ServiceC2041.f6789.getClass();
                        ServiceC2041.m7023(serviceC2041, Features2.installSeccomp(15));
                    } else {
                        ServiceC2041.m7014(serviceC2041);
                    }
                    ServiceC2041.m7019(new InterfaceC13227() { // from class: l.᩷ܺ᩸
                        @Override // l.InterfaceC13227
                        public final Object call() {
                            ServiceC2041.m7041(this.f71452.f64134, z);
                            return null;
                        }
                    });
                    serviceC2041.f6793 = true;
                    return true;
                }
                systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader != null) {
                    parent = systemClassLoader.getParent();
                }
            } catch (Throwable unused) {
            }
            str2 = null;
            C0147.m1312(file2);
            C0147.m1312(file3);
            C0147.m1312(file5);
            C0147.m1312(new File(file4, "files"));
            C0147.m1312(new File(file4, "cache"));
            C0147.m1312(new File(file4, "code_cache"));
            file.setReadOnly();
            String path4 = file.getPath();
            String path5 = file3.getPath();
            String path6 = file2.getPath();
            serviceC2041.f6798 = new C10090(path4, path5, path6, parent);
            serviceC2041.f6796 = new C19041(serviceC2041.getApplicationContext(), file, C4560.m14311(file.getPath()), serviceC2041.f6798, file2, file4, str2);
            if (z2) {
                C12481.m31018();
            }
            C13921 c13922 = ServiceC2041.f6787;
            String packageName3 = serviceC2041.f6796.getPackageName();
            String packageName4 = serviceC2041.getPackageName();
            String canonicalPath2 = canonicalFile2.getCanonicalPath();
            String strM44151 = serviceC2041.f6796.m44150();
            c13922.getClass();
            iInit = Features2.init(packageName3, packageName4, canonicalPath2, strM44151);
            if (iInit == 0) {
                throw new IllegalStateException("Native hook init failed: " + iInit);
            }
            if (z3) {
                ServiceC2041.f6789.getClass();
                ServiceC2041.m7023(serviceC2041, Features2.installSeccomp(15));
            } else {
                ServiceC2041.m7014(serviceC2041);
            }
            ServiceC2041.m7019(new InterfaceC13227() { // from class: l.᩷ܺ᩸
                @Override // l.InterfaceC13227
                public final Object call() {
                    ServiceC2041.m7041(this.f71452.f64134, z);
                    return null;
                }
            });
            serviceC2041.f6793 = true;
            return true;
        } catch (Exception e) {
            ServiceC2041.m7033(serviceC2041, false);
            serviceC2041.f6797 = e;
            return false;
        }
    }

    @Override // l.InterfaceC16956
    public final void exit() {
        this.f64134.stopSelf();
        System.exit(0);
    }

    @Override // l.InterfaceC16956
    /* JADX INFO: renamed from: ۨ */
    public final String[] mo29474() {
        ServiceC2041 serviceC2041 = this.f64134;
        if (serviceC2041.f6797 == null) {
            return null;
        }
        String message = serviceC2041.f6797.getMessage();
        if (message == null || message.isEmpty()) {
            message = serviceC2041.f6797.toString();
        }
        String stackTraceString = Log.getStackTraceString(serviceC2041.f6797);
        serviceC2041.f6797 = null;
        return new String[]{message, stackTraceString};
    }

    @Override // l.InterfaceC16956
    /* JADX INFO: renamed from: ۛ */
    public final int mo29471() {
        return this.f64134.f6791;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private Object m45864(byte[] bArr) {
        ServiceC2041 serviceC2041 = this.f64134;
        serviceC2041.f6797 = null;
        C20348 c20348 = new C20348(bArr);
        final String strM46756 = c20348.m46756();
        final String strM46757 = c20348.m46756();
        int i = c20348.readByte() & 255;
        final Class[] clsArr = new Class[i];
        final Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            switch (c20348.readByte()) {
                case 0:
                    clsArr[i2] = Byte.TYPE;
                    objArr[i2] = Byte.valueOf(c20348.readByte());
                    break;
                case 1:
                    clsArr[i2] = Short.TYPE;
                    objArr[i2] = Short.valueOf(c20348.readShort());
                    break;
                case 2:
                    clsArr[i2] = Character.TYPE;
                    objArr[i2] = Character.valueOf(c20348.m46751());
                    break;
                case 3:
                    clsArr[i2] = Integer.TYPE;
                    objArr[i2] = Integer.valueOf(c20348.readInt());
                    break;
                case 4:
                    clsArr[i2] = Long.TYPE;
                    objArr[i2] = Long.valueOf(c20348.readLong());
                    break;
                case 5:
                    clsArr[i2] = Float.TYPE;
                    objArr[i2] = Float.valueOf(c20348.m46747());
                    break;
                case 6:
                    clsArr[i2] = Double.TYPE;
                    objArr[i2] = Double.valueOf(Double.longBitsToDouble(c20348.readLong()));
                    break;
                case 7:
                    clsArr[i2] = Boolean.TYPE;
                    objArr[i2] = Boolean.valueOf(c20348.m46753());
                    break;
                case 8:
                    clsArr[i2] = String.class;
                    objArr[i2] = c20348.m46756();
                    break;
                case 9:
                    clsArr[i2] = Object.class;
                    objArr[i2] = c20348.m46756();
                    break;
                case 10:
                    clsArr[i2] = byte[].class;
                    objArr[i2] = c20348.m46748();
                    break;
                case 11:
                    clsArr[i2] = Object.class;
                    objArr[i2] = c20348.m46748();
                    break;
                case 12:
                    clsArr[i2] = short[].class;
                    int i3 = c20348.readInt();
                    short[] sArr = new short[i3];
                    for (int i4 = 0; i4 < i3; i4++) {
                        sArr[i4] = c20348.readShort();
                    }
                    objArr[i2] = sArr;
                    break;
                case 13:
                    clsArr[i2] = char[].class;
                    objArr[i2] = Character.valueOf(c20348.m46751());
                    break;
                case 14:
                    clsArr[i2] = int[].class;
                    objArr[i2] = c20348.m46755();
                    break;
                default:
                    serviceC2041.f6797 = new Exception("Unsupported parameter type");
                    return null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strM46756);
        sb.append(':');
        sb.append(strM46757);
        for (int i5 = 0; i5 < i; i5++) {
            Class cls = clsArr[i5];
            sb.append(':');
            sb.append(cls.getSimpleName());
        }
        final String string = sb.toString();
        if (serviceC2041.f6790.contains(string)) {
            serviceC2041.f6797 = new Exception(C25272.m56409("Disabled method: ", string));
            return null;
        }
        try {
            final Method method = (Method) ((ConcurrentMapC17249) serviceC2041.f6794).get(string);
            if (method == null) {
                method = (Method) ServiceC2041.m7019(new InterfaceC13227() { // from class: l.۬᩻᩸
                    @Override // l.InterfaceC13227
                    public final Object call() {
                        final BinderC19940 binderC19940 = this.f44928;
                        ServiceC2041 serviceC2042 = binderC19940.f64134;
                        final String str = string;
                        final String str2 = strM46756;
                        final String str3 = strM46757;
                        final Class[] clsArr2 = clsArr;
                        return ServiceC2041.m7018(serviceC2042, new InterfaceC13227() { // from class: l.ۢ᩻᩸
                            @Override // l.InterfaceC13227
                            public final Object call() {
                                String str4 = str2;
                                String str5 = str3;
                                Class<?>[] clsArr3 = clsArr2;
                                ServiceC2041 serviceC2043 = binderC19940.f64134;
                                ConcurrentMapC17249 concurrentMapC17249 = (ConcurrentMapC17249) serviceC2043.f6794;
                                String str6 = str;
                                Method method2 = (Method) concurrentMapC17249.get(str6);
                                if (method2 != null) {
                                    return method2;
                                }
                                try {
                                    Method declaredMethod = Class.forName(str4, true, serviceC2043.f6798).getDeclaredMethod(str5, clsArr3);
                                    if (!declaredMethod.isAccessible()) {
                                        declaredMethod.setAccessible(true);
                                    }
                                    ((ConcurrentMapC17249) serviceC2043.f6794).put(str6, declaredMethod);
                                    return declaredMethod;
                                } catch (Exception e) {
                                    serviceC2043.f6797 = e;
                                    return null;
                                }
                            }
                        });
                    }
                });
            }
            Future futureSubmit = ServiceC2041.f6786.submit(new Callable() { // from class: l.ۙܺ᩸
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ServiceC2041 serviceC2042 = this.f17417.f64134;
                    final Method method2 = method;
                    final Object[] objArr2 = objArr;
                    return ServiceC2041.m7018(serviceC2042, new InterfaceC13227() { // from class: l.ۤܺ᩸
                        @Override // l.InterfaceC13227
                        public final Object call() {
                            return method2.invoke(null, objArr2);
                        }
                    });
                }
            });
            try {
                return futureSubmit.get(2L, TimeUnit.SECONDS);
            } catch (ExecutionException e) {
                serviceC2041.f6797 = e.getCause();
                return null;
            } catch (TimeoutException e2) {
                serviceC2041.f6797 = e2;
                futureSubmit.cancel(true);
                serviceC2041.f6790.add(string);
                return null;
            }
        } catch (Throwable th) {
            serviceC2041.f6797 = th;
            return null;
        }
    }

    @Override // l.InterfaceC16956
    /* JADX INFO: renamed from: ᩸ */
    public final String mo29481(byte[] bArr) {
        Object objM45864 = m45864(bArr);
        if (objM45864 == null) {
            return null;
        }
        return objM45864.toString();
    }

    @Override // l.InterfaceC16956
    /* JADX INFO: renamed from: ܳ */
    public final String mo29476(byte[] bArr) {
        Integer num = (Integer) m45864(bArr);
        if (num == null) {
            return null;
        }
        return String.valueOf(num);
    }

    @Override // l.InterfaceC16956
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo29480(byte[] bArr) {
        return (byte[]) m45864(bArr);
    }

    @Override // l.InterfaceC16956
    /* JADX INFO: renamed from: ᩴ */
    public final int[] mo29478(byte[] bArr) {
        short[] sArr = (short[]) m45864(bArr);
        if (sArr == null) {
            return null;
        }
        int[] iArr = new int[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            iArr[i] = sArr[i];
        }
        return iArr;
    }

    @Override // l.InterfaceC16956
    /* JADX INFO: renamed from: ۤ */
    public final int[] mo29473(byte[] bArr) {
        char[] cArr = (char[]) m45864(bArr);
        if (cArr == null) {
            return null;
        }
        int[] iArr = new int[cArr.length];
        for (int i = 0; i < cArr.length; i++) {
            iArr[i] = cArr[i];
        }
        return iArr;
    }

    @Override // l.InterfaceC16956
    /* JADX INFO: renamed from: ۙ */
    public final int[] mo29470(byte[] bArr) {
        return (int[]) m45864(bArr);
    }

    @Override // l.InterfaceC16956
    /* JADX INFO: renamed from: ᩷ */
    public final int mo29479(final String str, final String str2) {
        ServiceC2041 serviceC2041 = this.f64134;
        serviceC2041.f6797 = null;
        try {
            return ((Integer) ServiceC2041.m7019(new InterfaceC13227() { // from class: l.ܿ᩻᩸
                @Override // l.InterfaceC13227
                public final Object call() {
                    final BinderC19940 binderC19940 = this.f60771;
                    ServiceC2041 serviceC2042 = binderC19940.f64134;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC2041.m7018(serviceC2042, new InterfaceC13227() { // from class: l.۟᩻᩸
                        @Override // l.InterfaceC13227
                        public final Object call() throws Exception {
                            C10090 c10090 = binderC19940.f64134.f6798;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c10090).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C3188.m10404("Field ", str5, ".", str6, " not found"));
                                }
                                Field field = declaredFields[i];
                                if (Modifier.isStatic(field.getModifiers()) && field.getType() == Integer.TYPE && field.getName().equals(str6)) {
                                    field.setAccessible(true);
                                    return field.get(null);
                                }
                                i++;
                            }
                        }
                    });
                }
            })).intValue();
        } catch (Throwable th) {
            serviceC2041.f6797 = th;
            return -1;
        }
    }

    @Override // l.InterfaceC16956
    /* JADX INFO: renamed from: ܳ */
    public final String mo29475(final String str, final String str2) {
        ServiceC2041 serviceC2041 = this.f64134;
        serviceC2041.f6797 = null;
        try {
            return (String) ServiceC2041.m7019(new InterfaceC13227() { // from class: l.ۡ᩻᩸
                @Override // l.InterfaceC13227
                public final Object call() {
                    final BinderC19940 binderC19940 = this.f31418;
                    ServiceC2041 serviceC2042 = binderC19940.f64134;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC2041.m7018(serviceC2042, new InterfaceC13227() { // from class: l.֡᩻᩸
                        @Override // l.InterfaceC13227
                        public final Object call() throws Exception {
                            C10090 c10090 = binderC19940.f64134.f6798;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c10090).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C3188.m10404("Field ", str5, ".", str6, " not found"));
                                }
                                Field field = declaredFields[i];
                                if (Modifier.isStatic(field.getModifiers()) && field.getType() == String.class && field.getName().equals(str6)) {
                                    field.setAccessible(true);
                                    return field.get(null);
                                }
                                i++;
                            }
                        }
                    });
                }
            });
        } catch (Throwable th) {
            serviceC2041.f6797 = th;
            return null;
        }
    }

    @Override // l.InterfaceC16956
    /* JADX INFO: renamed from: ۙ */
    public final int[] mo29469(final String str, final String str2) {
        ServiceC2041 serviceC2041 = this.f64134;
        serviceC2041.f6797 = null;
        try {
            return (int[]) ServiceC2041.m7019(new InterfaceC13227() { // from class: l.ۖ᩻᩸
                @Override // l.InterfaceC13227
                public final Object call() {
                    final BinderC19940 binderC19940 = this.f9818;
                    ServiceC2041 serviceC2042 = binderC19940.f64134;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC2041.m7018(serviceC2042, new InterfaceC13227() { // from class: l.ᩳ᩻᩸
                        @Override // l.InterfaceC13227
                        public final Object call() throws Exception {
                            C10090 c10090 = binderC19940.f64134.f6798;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c10090).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C3188.m10404("Field ", str5, ".", str6, " not found"));
                                }
                                Field field = declaredFields[i];
                                if (Modifier.isStatic(field.getModifiers()) && field.getType() == short[].class && field.getName().equals(str6)) {
                                    field.setAccessible(true);
                                    short[] sArr = (short[]) field.get(null);
                                    if (sArr == null) {
                                        return null;
                                    }
                                    int[] iArr = new int[sArr.length];
                                    for (int i2 = 0; i2 < sArr.length; i2++) {
                                        iArr[i2] = sArr[i2];
                                    }
                                    return iArr;
                                }
                                i++;
                            }
                        }
                    });
                }
            });
        } catch (Throwable th) {
            serviceC2041.f6797 = th;
            return null;
        }
    }

    @Override // l.InterfaceC16956
    /* JADX INFO: renamed from: ᩸ */
    public final int[] mo29482(final String str, final String str2) {
        ServiceC2041 serviceC2041 = this.f64134;
        serviceC2041.f6797 = null;
        try {
            return (int[]) ServiceC2041.m7019(new InterfaceC13227() { // from class: l.۠᩻᩸
                @Override // l.InterfaceC13227
                public final Object call() {
                    final BinderC19940 binderC19940 = this.f29300;
                    ServiceC2041 serviceC2042 = binderC19940.f64134;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC2041.m7018(serviceC2042, new InterfaceC13227() { // from class: l.֨᩻᩸
                        @Override // l.InterfaceC13227
                        public final Object call() throws Exception {
                            C10090 c10090 = binderC19940.f64134.f6798;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c10090).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C3188.m10404("Field ", str5, ".", str6, " not found"));
                                }
                                Field field = declaredFields[i];
                                if (Modifier.isStatic(field.getModifiers()) && field.getType() == char[].class && field.getName().equals(str6)) {
                                    field.setAccessible(true);
                                    char[] cArr = (char[]) field.get(null);
                                    if (cArr == null) {
                                        return null;
                                    }
                                    int[] iArr = new int[cArr.length];
                                    for (int i2 = 0; i2 < cArr.length; i2++) {
                                        iArr[i2] = cArr[i2];
                                    }
                                    return iArr;
                                }
                                i++;
                            }
                        }
                    });
                }
            });
        } catch (Throwable th) {
            serviceC2041.f6797 = th;
            return null;
        }
    }

    @Override // l.InterfaceC16956
    /* JADX INFO: renamed from: ۤ */
    public final int[] mo29472(final String str, final String str2) {
        ServiceC2041 serviceC2041 = this.f64134;
        serviceC2041.f6797 = null;
        try {
            return (int[]) ServiceC2041.m7019(new InterfaceC13227() { // from class: l.ۜ᩻᩸
                @Override // l.InterfaceC13227
                public final Object call() {
                    final BinderC19940 binderC19940 = this.f24807;
                    ServiceC2041 serviceC2042 = binderC19940.f64134;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC2041.m7018(serviceC2042, new InterfaceC13227() { // from class: l.᩸ܺ᩸
                        @Override // l.InterfaceC13227
                        public final Object call() throws Exception {
                            C10090 c10090 = binderC19940.f64134.f6798;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c10090).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C3188.m10404("Field ", str5, ".", str6, " not found"));
                                }
                                Field field = declaredFields[i];
                                if (Modifier.isStatic(field.getModifiers()) && field.getType() == int[].class && field.getName().equals(str6)) {
                                    field.setAccessible(true);
                                    return field.get(null);
                                }
                                i++;
                            }
                        }
                    });
                }
            });
        } catch (Throwable th) {
            serviceC2041.f6797 = th;
            return null;
        }
    }

    @Override // l.InterfaceC16956
    /* JADX INFO: renamed from: ᩴ */
    public final void mo29477(String str, String str2) {
        C12481.m31014(str, str2);
    }
}
