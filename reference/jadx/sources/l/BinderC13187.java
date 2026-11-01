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

/* JADX INFO: renamed from: l.۬ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1X4 */
/* JADX INFO: loaded from: classes4.dex */
public final class BinderC13187 extends AbstractBinderC18125 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC15304 f43895;

    public BinderC13187(ServiceC15304 serviceC15304) {
        this.f43895 = serviceC15304;
        attachInterface(this, "bin.mt.dstr.ipc.IDecryptorAidlInterface");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00ca A[Catch: all -> 0x00ce, TRY_LEAVE, TryCatch #0 {all -> 0x00ce, blocks: (B:19:0x00c4, B:21:0x00ca), top: B:42:0x00c4 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00ef A[Catch: Exception -> 0x0161, TryCatch #1 {Exception -> 0x0161, blocks: (B:7:0x0022, B:9:0x0040, B:11:0x004d, B:18:0x008c, B:22:0x00ce, B:24:0x00ef, B:25:0x00f2, B:28:0x0119, B:30:0x012d, B:29:0x012a, B:32:0x013b, B:33:0x014c, B:14:0x0077, B:34:0x014d, B:35:0x0154, B:36:0x0155, B:37:0x0160), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0119 A[Catch: Exception -> 0x0161, TryCatch #1 {Exception -> 0x0161, blocks: (B:7:0x0022, B:9:0x0040, B:11:0x004d, B:18:0x008c, B:22:0x00ce, B:24:0x00ef, B:25:0x00f2, B:28:0x0119, B:30:0x012d, B:29:0x012a, B:32:0x013b, B:33:0x014c, B:14:0x0077, B:34:0x014d, B:35:0x0154, B:36:0x0155, B:37:0x0160), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x012a A[Catch: Exception -> 0x0161, TryCatch #1 {Exception -> 0x0161, blocks: (B:7:0x0022, B:9:0x0040, B:11:0x004d, B:18:0x008c, B:22:0x00ce, B:24:0x00ef, B:25:0x00f2, B:28:0x0119, B:30:0x012d, B:29:0x012a, B:32:0x013b, B:33:0x014c, B:14:0x0077, B:34:0x014d, B:35:0x0154, B:36:0x0155, B:37:0x0160), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x013b A[Catch: Exception -> 0x0161, TryCatch #1 {Exception -> 0x0161, blocks: (B:7:0x0022, B:9:0x0040, B:11:0x004d, B:18:0x008c, B:22:0x00ce, B:24:0x00ef, B:25:0x00f2, B:28:0x0119, B:30:0x012d, B:29:0x012a, B:32:0x013b, B:33:0x014c, B:14:0x0077, B:34:0x014d, B:35:0x0154, B:36:0x0155, B:37:0x0160), top: B:44:0x0022 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x013b, please report this as an issue */
    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo32596(String str, final boolean z, boolean z2, boolean z3) {
        String str2;
        int iInit;
        ClassLoader systemClassLoader;
        ServiceC15304 serviceC15304 = this.f43895;
        ClassLoader parent = null;
        serviceC15304.f49866 = null;
        if (serviceC15304.f49868) {
            serviceC15304.f49866 = new IllegalStateException("Decryptor session already loaded");
            return false;
        }
        ServiceC15304.m36641(serviceC15304, true);
        try {
            File canonicalFile = new File(serviceC15304.getCacheDir(), "decrypt").getCanonicalFile();
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile.equals(canonicalFile2)) {
                throw new IllegalArgumentException(C0252.m1693("Unsupported work dir: ", str));
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
                    String strTrim = C15071.m36112(file6).trim();
                    if (!strTrim.isEmpty()) {
                        str2 = strTrim;
                    }
                    C15071.m36106(file2);
                    C15071.m36106(file3);
                    C15071.m36106(file5);
                    C15071.m36106(new File(file4, "files"));
                    C15071.m36106(new File(file4, "cache"));
                    C15071.m36106(new File(file4, "code_cache"));
                    file.setReadOnly();
                    String path = file.getPath();
                    String path2 = file3.getPath();
                    String path3 = file2.getPath();
                    systemClassLoader = ClassLoader.getSystemClassLoader();
                    if (systemClassLoader != null) {
                        parent = systemClassLoader.getParent();
                    }
                    serviceC15304.f49867 = new C14351(path, path2, path3, parent);
                    serviceC15304.f49860 = new C23523(serviceC15304.getApplicationContext(), file, C0735.m3192(file.getPath()), serviceC15304.f49867, file2, file4, str2);
                    if (z2) {
                        C20948.m47122();
                    }
                    C0219 c0219 = ServiceC15304.f49858;
                    String packageName = serviceC15304.f49860.getPackageName();
                    String packageName2 = serviceC15304.getPackageName();
                    String canonicalPath = canonicalFile2.getCanonicalPath();
                    String strM51816 = serviceC15304.f49860.m51816();
                    c0219.getClass();
                    iInit = Features2.init(packageName, packageName2, canonicalPath, strM51816);
                    if (iInit == 0) {
                        throw new IllegalStateException("Native hook init failed: " + iInit);
                    }
                    if (z3) {
                        ServiceC15304.f49857.getClass();
                        ServiceC15304.m36630(serviceC15304, Features2.installSeccomp(15));
                    } else {
                        ServiceC15304.m36621(serviceC15304);
                    }
                    ServiceC15304.m36625(new InterfaceC6836() { // from class: l.ۚܶۖ
                        @Override // l.InterfaceC6836
                        public final Object call() {
                            ServiceC15304.m36646(this.f18738.f43895, z);
                            return null;
                        }
                    });
                    serviceC15304.f49868 = true;
                    return true;
                }
                systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader != null) {
                    parent = systemClassLoader.getParent();
                }
            } catch (Throwable unused) {
            }
            str2 = null;
            C15071.m36106(file2);
            C15071.m36106(file3);
            C15071.m36106(file5);
            C15071.m36106(new File(file4, "files"));
            C15071.m36106(new File(file4, "cache"));
            C15071.m36106(new File(file4, "code_cache"));
            file.setReadOnly();
            String path4 = file.getPath();
            String path5 = file3.getPath();
            String path6 = file2.getPath();
            serviceC15304.f49867 = new C14351(path4, path5, path6, parent);
            serviceC15304.f49860 = new C23523(serviceC15304.getApplicationContext(), file, C0735.m3192(file.getPath()), serviceC15304.f49867, file2, file4, str2);
            if (z2) {
                C20948.m47122();
            }
            C0219 c02110 = ServiceC15304.f49858;
            String packageName3 = serviceC15304.f49860.getPackageName();
            String packageName4 = serviceC15304.getPackageName();
            String canonicalPath2 = canonicalFile2.getCanonicalPath();
            String strM51817 = serviceC15304.f49860.m51816();
            c02110.getClass();
            iInit = Features2.init(packageName3, packageName4, canonicalPath2, strM51817);
            if (iInit == 0) {
                throw new IllegalStateException("Native hook init failed: " + iInit);
            }
            if (z3) {
                ServiceC15304.f49857.getClass();
                ServiceC15304.m36630(serviceC15304, Features2.installSeccomp(15));
            } else {
                ServiceC15304.m36621(serviceC15304);
            }
            ServiceC15304.m36625(new InterfaceC6836() { // from class: l.ۚܶۖ
                @Override // l.InterfaceC6836
                public final Object call() {
                    ServiceC15304.m36646(this.f18738.f43895, z);
                    return null;
                }
            });
            serviceC15304.f49868 = true;
            return true;
        } catch (Exception e) {
            ServiceC15304.m36641(serviceC15304, false);
            serviceC15304.f49866 = e;
            return false;
        }
    }

    @Override // l.InterfaceC18831
    public final void exit() {
        this.f43895.stopSelf();
        System.exit(0);
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String[] mo32601() {
        ServiceC15304 serviceC15304 = this.f43895;
        if (serviceC15304.f49866 == null) {
            return null;
        }
        String message = serviceC15304.f49866.getMessage();
        if (message == null || message.isEmpty()) {
            message = serviceC15304.f49866.toString();
        }
        String stackTraceString = Log.getStackTraceString(serviceC15304.f49866);
        serviceC15304.f49866 = null;
        return new String[]{message, stackTraceString};
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo32602() {
        return this.f43895.f49862;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private Object m32593(byte[] bArr) {
        ServiceC15304 serviceC15304 = this.f43895;
        serviceC15304.f49866 = null;
        C17367 c17367 = new C17367(bArr);
        final String strM40442 = c17367.m40442();
        final String strM40443 = c17367.m40442();
        int i = c17367.readByte() & 255;
        final Class[] clsArr = new Class[i];
        final Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            switch (c17367.readByte()) {
                case 0:
                    clsArr[i2] = Byte.TYPE;
                    objArr[i2] = Byte.valueOf(c17367.readByte());
                    break;
                case 1:
                    clsArr[i2] = Short.TYPE;
                    objArr[i2] = Short.valueOf(c17367.readShort());
                    break;
                case 2:
                    clsArr[i2] = Character.TYPE;
                    objArr[i2] = Character.valueOf(c17367.m40443());
                    break;
                case 3:
                    clsArr[i2] = Integer.TYPE;
                    objArr[i2] = Integer.valueOf(c17367.readInt());
                    break;
                case 4:
                    clsArr[i2] = Long.TYPE;
                    objArr[i2] = Long.valueOf(c17367.readLong());
                    break;
                case 5:
                    clsArr[i2] = Float.TYPE;
                    objArr[i2] = Float.valueOf(c17367.m40450());
                    break;
                case 6:
                    clsArr[i2] = Double.TYPE;
                    objArr[i2] = Double.valueOf(Double.longBitsToDouble(c17367.readLong()));
                    break;
                case 7:
                    clsArr[i2] = Boolean.TYPE;
                    objArr[i2] = Boolean.valueOf(c17367.m40461());
                    break;
                case 8:
                    clsArr[i2] = String.class;
                    objArr[i2] = c17367.m40442();
                    break;
                case 9:
                    clsArr[i2] = Object.class;
                    objArr[i2] = c17367.m40442();
                    break;
                case 10:
                    clsArr[i2] = byte[].class;
                    objArr[i2] = c17367.m40451();
                    break;
                case 11:
                    clsArr[i2] = Object.class;
                    objArr[i2] = c17367.m40451();
                    break;
                case 12:
                    clsArr[i2] = short[].class;
                    int i3 = c17367.readInt();
                    short[] sArr = new short[i3];
                    for (int i4 = 0; i4 < i3; i4++) {
                        sArr[i4] = c17367.readShort();
                    }
                    objArr[i2] = sArr;
                    break;
                case 13:
                    clsArr[i2] = char[].class;
                    objArr[i2] = Character.valueOf(c17367.m40443());
                    break;
                case 14:
                    clsArr[i2] = int[].class;
                    objArr[i2] = c17367.m40460();
                    break;
                default:
                    serviceC15304.f49866 = new Exception("Unsupported parameter type");
                    return null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strM40442);
        sb.append(':');
        sb.append(strM40443);
        for (int i5 = 0; i5 < i; i5++) {
            Class cls = clsArr[i5];
            sb.append(':');
            sb.append(cls.getSimpleName());
        }
        final String string = sb.toString();
        if (serviceC15304.f49865.contains(string)) {
            serviceC15304.f49866 = new Exception(C0252.m1693("Disabled method: ", string));
            return null;
        }
        try {
            final Method method = (Method) ((ConcurrentMapC13783) serviceC15304.f49861).get(string);
            if (method == null) {
                method = (Method) ServiceC15304.m36625(new InterfaceC6836() { // from class: l.ۨܶۖ
                    @Override // l.InterfaceC6836
                    public final Object call() {
                        final BinderC13187 binderC13187 = this.f39523;
                        ServiceC15304 serviceC15305 = binderC13187.f43895;
                        final String str = string;
                        final String str2 = strM40442;
                        final String str3 = strM40443;
                        final Class[] clsArr2 = clsArr;
                        return ServiceC15304.m36626(serviceC15305, new InterfaceC6836() { // from class: l.ܳ᩺ۖ
                            @Override // l.InterfaceC6836
                            public final Object call() {
                                String str4 = str2;
                                String str5 = str3;
                                Class<?>[] clsArr3 = clsArr2;
                                ServiceC15304 serviceC15306 = binderC13187.f43895;
                                ConcurrentMapC13783 concurrentMapC13783 = (ConcurrentMapC13783) serviceC15306.f49861;
                                String str6 = str;
                                Method method2 = (Method) concurrentMapC13783.get(str6);
                                if (method2 != null) {
                                    return method2;
                                }
                                try {
                                    Method declaredMethod = Class.forName(str4, true, serviceC15306.f49867).getDeclaredMethod(str5, clsArr3);
                                    if (!declaredMethod.isAccessible()) {
                                        declaredMethod.setAccessible(true);
                                    }
                                    ((ConcurrentMapC13783) serviceC15306.f49861).put(str6, declaredMethod);
                                    return declaredMethod;
                                } catch (Exception e) {
                                    serviceC15306.f49866 = e;
                                    return null;
                                }
                            }
                        });
                    }
                });
            }
            Future futureSubmit = ServiceC15304.f49859.submit(new Callable() { // from class: l.ۖܶۖ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ServiceC15304 serviceC15305 = this.f10201.f43895;
                    final Method method2 = method;
                    final Object[] objArr2 = objArr;
                    return ServiceC15304.m36626(serviceC15305, new InterfaceC6836() { // from class: l.᩹ܶۖ
                        @Override // l.InterfaceC6836
                        public final Object call() {
                            return method2.invoke(null, objArr2);
                        }
                    });
                }
            });
            try {
                return futureSubmit.get(2L, TimeUnit.SECONDS);
            } catch (ExecutionException e) {
                serviceC15304.f49866 = e.getCause();
                return null;
            } catch (TimeoutException e2) {
                serviceC15304.f49866 = e2;
                futureSubmit.cancel(true);
                serviceC15304.f49865.add(string);
                return null;
            }
        } catch (Throwable th) {
            serviceC15304.f49866 = th;
            return null;
        }
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String mo32594(byte[] bArr) {
        Object objM32593 = m32593(bArr);
        if (objM32593 == null) {
            return null;
        }
        return objM32593.toString();
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String mo32608(byte[] bArr) {
        Integer num = (Integer) m32593(bArr);
        if (num == null) {
            return null;
        }
        return String.valueOf(num);
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] mo32606(byte[] bArr) {
        return (byte[]) m32593(bArr);
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] mo32600(byte[] bArr) {
        short[] sArr = (short[]) m32593(bArr);
        if (sArr == null) {
            return null;
        }
        int[] iArr = new int[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            iArr[i] = sArr[i];
        }
        return iArr;
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] mo32604(byte[] bArr) {
        char[] cArr = (char[]) m32593(bArr);
        if (cArr == null) {
            return null;
        }
        int[] iArr = new int[cArr.length];
        for (int i = 0; i < cArr.length; i++) {
            iArr[i] = cArr[i];
        }
        return iArr;
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] mo32598(byte[] bArr) {
        return (int[]) m32593(bArr);
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo32605(final String str, final String str2) {
        ServiceC15304 serviceC15304 = this.f43895;
        serviceC15304.f49866 = null;
        try {
            return ((Integer) ServiceC15304.m36625(new InterfaceC6836() { // from class: l.ܿ᩺ۖ
                @Override // l.InterfaceC6836
                public final Object call() {
                    final BinderC13187 binderC13187 = this.f56091;
                    ServiceC15304 serviceC15305 = binderC13187.f43895;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC15304.m36626(serviceC15305, new InterfaceC6836() { // from class: l.ۧ᩺ۖ
                        @Override // l.InterfaceC6836
                        public final Object call() throws Exception {
                            C14351 c14351 = binderC13187.f43895.f49867;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c14351).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C0242.m1617("Field ", str5, ".", str6, " not found"));
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
            serviceC15304.f49866 = th;
            return -1;
        }
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String mo32607(final String str, final String str2) {
        ServiceC15304 serviceC15304 = this.f43895;
        serviceC15304.f49866 = null;
        try {
            return (String) ServiceC15304.m36625(new InterfaceC6836() { // from class: l.ۢ᩺ۖ
                @Override // l.InterfaceC6836
                public final Object call() {
                    final BinderC13187 binderC13187 = this.f33760;
                    ServiceC15304 serviceC15305 = binderC13187.f43895;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC15304.m36626(serviceC15305, new InterfaceC6836() { // from class: l.ۛ᩺ۖ
                        @Override // l.InterfaceC6836
                        public final Object call() throws Exception {
                            C14351 c14351 = binderC13187.f43895.f49867;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c14351).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C0242.m1617("Field ", str5, ".", str6, " not found"));
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
            serviceC15304.f49866 = th;
            return null;
        }
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] mo32597(final String str, final String str2) {
        ServiceC15304 serviceC15304 = this.f43895;
        serviceC15304.f49866 = null;
        try {
            return (int[]) ServiceC15304.m36625(new InterfaceC6836() { // from class: l.ۗ᩺ۖ
                @Override // l.InterfaceC6836
                public final Object call() {
                    final BinderC13187 binderC13187 = this.f13027;
                    ServiceC15304 serviceC15305 = binderC13187.f43895;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC15304.m36626(serviceC15305, new InterfaceC6836() { // from class: l.᩻᩺ۖ
                        @Override // l.InterfaceC6836
                        public final Object call() throws Exception {
                            C14351 c14351 = binderC13187.f43895.f49867;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c14351).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C0242.m1617("Field ", str5, ".", str6, " not found"));
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
            serviceC15304.f49866 = th;
            return null;
        }
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] mo32595(final String str, final String str2) {
        ServiceC15304 serviceC15304 = this.f43895;
        serviceC15304.f49866 = null;
        try {
            return (int[]) ServiceC15304.m36625(new InterfaceC6836() { // from class: l.ۙܶۖ
                @Override // l.InterfaceC6836
                public final Object call() {
                    final BinderC13187 binderC13187 = this.f16656;
                    ServiceC15304 serviceC15305 = binderC13187.f43895;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC15304.m36626(serviceC15305, new InterfaceC6836() { // from class: l.֫᩺ۖ
                        @Override // l.InterfaceC6836
                        public final Object call() throws Exception {
                            C14351 c14351 = binderC13187.f43895.f49867;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c14351).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C0242.m1617("Field ", str5, ".", str6, " not found"));
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
            serviceC15304.f49866 = th;
            return null;
        }
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] mo32603(final String str, final String str2) {
        ServiceC15304 serviceC15304 = this.f43895;
        serviceC15304.f49866 = null;
        try {
            return (int[]) ServiceC15304.m36625(new InterfaceC6836() { // from class: l.ܰܶۖ
                @Override // l.InterfaceC6836
                public final Object call() {
                    final BinderC13187 binderC13187 = this.f45768;
                    ServiceC15304 serviceC15305 = binderC13187.f43895;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC15304.m36626(serviceC15305, new InterfaceC6836() { // from class: l.֨ܶۖ
                        @Override // l.InterfaceC6836
                        public final Object call() throws Exception {
                            C14351 c14351 = binderC13187.f43895.f49867;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c14351).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C0242.m1617("Field ", str5, ".", str6, " not found"));
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
            serviceC15304.f49866 = th;
            return null;
        }
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo32599(String str, String str2) {
        C20948.m47124(str, str2);
    }
}
