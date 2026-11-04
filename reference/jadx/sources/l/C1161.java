package l;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import bin.mt.plus.Features3;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֨ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A16O */
/* JADX INFO: loaded from: classes3.dex */
public class C1161 extends AbstractC22044 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final boolean f4287 = Build.MANUFACTURER.toLowerCase().contains("huawei");

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final File f4288;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f4289;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f4290;

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1161 mo4275() {
        return this;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۛ᩷ */
    public final boolean mo2945() {
        return true;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean mo4293() {
        return false;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo4295() {
        return true;
    }

    public C1161(File file) {
        this(file, false);
    }

    public C1161(File file, boolean z) {
        this.f4288 = file;
        this.f4290 = z;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 mo4284() {
        return new C1161(this.f4288.getAbsoluteFile(), this.f4290);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final String mo4278() {
        return this.f4288.getAbsolutePath();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean mo4283() {
        try {
            return this.f4288.createNewFile();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean mo4274() {
        return this.f4288.mkdirs();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC11601 mo4298() {
        return new C2652(this);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo4291() {
        return !this.f4290 && m49870();
    }

    @Override // l.AbstractC22044
    public String getName() {
        return this.f4288.getName();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public String mo4294() {
        return this.f4288.getPath();
    }

    @Override // l.AbstractC22044
    public String getParent() {
        return this.f4288.getParent();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean mo4296() {
        boolean zM1307;
        String strM35186;
        boolean z = f4287;
        File file = this.f4288;
        if (z) {
            zM1307 = C0656.m2868(file);
        } else {
            zM1307 = C0147.m1307(file);
        }
        if (!zM1307 && m4272()) {
            zM1307 = true;
        }
        if (!zM1307 && C4013.m12986().mo29539() && file.exists() && (strM35186 = C14584.m35186(file.getPath())) != null) {
            try {
                C14453.m34910("/data/media/" + C6382.f21566.getName() + "/" + strM35186);
                return true;
            } catch (IOException unused) {
            }
        }
        return zM1307;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean mo4287() {
        boolean zDelete;
        String strM35186;
        File file = this.f4288;
        try {
            if (f4287) {
                zDelete = C0656.m2869(file);
            } else {
                zDelete = file.delete();
            }
            if (!zDelete && m4272()) {
                zDelete = true;
            }
        } catch (Exception unused) {
            zDelete = false;
        }
        if (!zDelete && C4013.m12986().mo29539() && file.exists() && (strM35186 = C14584.m35186(file.getPath())) != null) {
            try {
                C14453.m34910("/data/media/" + C6382.f21566.getName() + "/" + strM35186);
                return true;
            } catch (IOException unused2) {
            }
        }
        return zDelete;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo4301(AbstractC22044 abstractC22044) {
        String strMo4278 = abstractC22044.mo4278();
        File file = abstractC22044.mo4295() ? abstractC22044.mo4275().f4288 : new File(strMo4278);
        long jM4288 = m4288(abstractC22044);
        if (!this.f4288.renameTo(file)) {
            byte[] bArrM4273 = m4273();
            if (bArrM4273 != null) {
                if (!Features3.rename(m49881(), bArrM4273, strMo4278)) {
                    if (C4013.m12986().mo29539()) {
                        C15945 c15945M21077 = null;
                        try {
                            c15945M21077 = C7742.m21077(false);
                            if (!c15945M21077.m38035()) {
                                c15945M21077.m38061();
                                return false;
                            }
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byteArrayOutputStream.write(m49881().getBytes());
                            byteArrayOutputStream.write(47);
                            byteArrayOutputStream.write(bArrM4273);
                            c15945M21077.m38031(byteArrayOutputStream.toByteArray(), strMo4278.getBytes());
                            c15945M21077.m38061();
                        } catch (IOException unused) {
                            if (c15945M21077 != null) {
                                c15945M21077.m38061();
                            }
                        } catch (Throwable th) {
                            if (c15945M21077 != null) {
                                c15945M21077.m38061();
                            }
                            throw th;
                        }
                    }
                }
            }
            return false;
        }
        if (jM4288 < 0) {
            return true;
        }
        try {
            if (file.setLastModified(jM4288)) {
                return true;
            }
            file.toString();
            return true;
        } catch (RuntimeException unused2) {
            C17359.toString(file);
            return true;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m4288(AbstractC22044 abstractC22044) {
        if (!this.f4290 && abstractC22044.mo4295() && !abstractC22044.mo4275().f4290) {
            File file = this.f4288;
            try {
                return Features3.m46(file.getPath());
            } catch (IOException | RuntimeException unused) {
                C17359.toString(file);
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۟᩷, reason: not valid java name and contains not printable characters */
    private boolean m4272() {
        byte[] bArrM4273 = m4273();
        if (bArrM4273 != null) {
            if (Features3.delete(m49881(), bArrM4273)) {
                return true;
            }
            if (C4013.m12986().mo29539()) {
                C15945 c15945M21077 = null;
                try {
                    c15945M21077 = C7742.m21077(false);
                    if (c15945M21077.m38035()) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(m49881().getBytes());
                        byteArrayOutputStream.write(47);
                        byteArrayOutputStream.write(bArrM4273);
                        c15945M21077.m38057(byteArrayOutputStream.toByteArray());
                        c15945M21077.m38061();
                        return true;
                    }
                } catch (IOException unused) {
                    if (c15945M21077 != null) {
                    }
                    return false;
                } catch (Throwable th) {
                    if (c15945M21077 != null) {
                        c15945M21077.m38061();
                    }
                    throw th;
                }
                c15945M21077.m38061();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    private byte[] m4273() {
        String name = this.f4288.getName();
        if (!C18856.m43751(name)) {
            return null;
        }
        for (byte[] bArr : Features3.listGarbledFileNames(m49881())) {
            String strNewStringUTF = Features3.newStringUTF(bArr);
            if (!name.equals(strNewStringUTF)) {
                if (strNewStringUTF.length() == name.length()) {
                    String str = new String(strNewStringUTF.getBytes());
                    String str2 = new String(name.getBytes());
                    if (!str2.equals(str)) {
                        name = str2;
                    }
                }
            }
            return bArr;
        }
        return null;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2934() {
        return this.f4288.exists();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo4304() {
        return this.f4288.isFile();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo4281() {
        return this.f4288.isDirectory();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo4297() {
        File file = this.f4288;
        return file.isFile() || file.isDirectory();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final long mo4285() {
        return this.f4288.length();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final long mo4286() {
        return this.f4288.lastModified();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2942(long j) {
        if (j < 0) {
            return false;
        }
        return this.f4288.setLastModified(j);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩴۙ */
    public final String mo2954() {
        String strM48 = this.f4289;
        if (strM48 == null) {
            strM48 = Features3.m48(this.f4288.getAbsolutePath());
            if (strM48 == null) {
                strM48 = "";
            }
            this.f4289 = strM48;
        }
        if (strM48.isEmpty()) {
            return null;
        }
        return strM48;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean mo4302() {
        return this.f4288.canRead();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean mo4277() {
        return !this.f4290;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean mo4303() {
        return this.f4288.canWrite();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18555 mo2938(InterfaceC21539 interfaceC21539) {
        return new C10109(this, interfaceC21539);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List mo4299(final boolean z) {
        File[] fileArrListFiles = this.f4288.listFiles();
        if (fileArrListFiles == null) {
            return new ArrayList();
        }
        int i = 0;
        return (List) C13847.stream(fileArrListFiles).filter(new Predicate() { // from class: l.ܿۨᩴ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return z || !((File) obj).getName().startsWith(".");
            }
        }).map(new C0415(i)).map(new C7873(i)).collect(C2025.toList());
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final List mo4282() {
        String[] list = this.f4288.list();
        if (list == null) {
            return new ArrayList();
        }
        return (List) C13847.stream(list).filter(new C19060(0)).collect(C2025.toList());
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public final InputStream mo4290() {
        return new C16221(this.f4288);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final OutputStream mo4289(boolean z) {
        return new FileOutputStream(this.f4288, z);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public final FileChannel mo4280() {
        return C19853.convertMaybeLegacyFileChannelFromLibrary(new RandomAccessFile(this.f4288, "r").getChannel());
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC15475 mo4276(String str) {
        return C11746.m29497(this.f4288, str);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ParcelFileDescriptor mo4279(String str) {
        return ParcelFileDescriptor.open(this.f4288, C22965.m51832(str));
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public boolean mo4292() {
        return !this.f4290;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean mo4300(InterfaceC7509 interfaceC7509) {
        C22616 c22616M50953;
        if (mo4292() && (c22616M50953 = C22616.m50953(this, interfaceC7509)) != null) {
            AbstractC22044 abstractC22044M50964 = c22616M50953.m50964();
            AbstractC22044 abstractC22044M49856 = abstractC22044M50964.m49856();
            if (abstractC22044M49856.mo4274()) {
                if (!mo4301(abstractC22044M50964)) {
                    abstractC22044M49856.mo4296();
                    return false;
                }
                if (c22616M50953.m50962()) {
                    return true;
                }
                abstractC22044M50964.mo4301(this);
                abstractC22044M49856.mo4296();
                return false;
            }
        }
        return false;
    }
}
