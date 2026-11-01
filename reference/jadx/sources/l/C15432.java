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

/* JADX INFO: renamed from: l.ܶ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A16O */
/* JADX INFO: loaded from: classes4.dex */
public class C15432 extends AbstractC20745 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final boolean f50292 = Build.MANUFACTURER.toLowerCase().contains("huawei");

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f50293;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final File f50294;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f50295;

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo36912() {
        return true;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C15432 mo36913() {
        return this;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۤܰ */
    public final boolean mo8448() {
        return true;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo33985() {
        return false;
    }

    public C15432(File file) {
        this(file, false);
    }

    public C15432(File file, boolean z) {
        this.f50294 = file;
        this.f50295 = z;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC20745 mo24641() {
        return new C15432(this.f50294.getAbsoluteFile(), this.f50295);
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۙۙ */
    public final String mo24643() {
        return this.f50294.getAbsolutePath();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo33978() {
        try {
            return this.f50294.createNewFile();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo33987() {
        return this.f50294.mkdirs();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC10868 mo33989() {
        return new C18253(this);
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۡ */
    public final boolean mo33972() {
        return !this.f50295 && m46729();
    }

    @Override // l.AbstractC20745
    public String getName() {
        return this.f50294.getName();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܶۙ */
    public String mo33986() {
        return this.f50294.getPath();
    }

    @Override // l.AbstractC20745
    public String getParent() {
        return this.f50294.getParent();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo24647() {
        boolean zM36110;
        String strM15306;
        boolean z = f50292;
        File file = this.f50294;
        if (z) {
            zM36110 = C6633.m17990(file);
        } else {
            zM36110 = C15071.m36110(file);
        }
        if (!zM36110 && m36911()) {
            zM36110 = true;
        }
        if (!zM36110 && C19812.m45045().mo43871() && file.exists() && (strM15306 = C5553.m15306(file.getPath())) != null) {
            try {
                C0055.m955("/data/media/" + C11904.f39934.getName() + "/" + strM15306);
                return true;
            } catch (IOException unused) {
            }
        }
        return zM36110;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۛ */
    public final boolean mo24644() {
        boolean zDelete;
        String strM15306;
        File file = this.f50294;
        try {
            if (f50292) {
                zDelete = C6633.m17991(file);
            } else {
                zDelete = file.delete();
            }
            if (!zDelete && m36911()) {
                zDelete = true;
            }
        } catch (Exception unused) {
            zDelete = false;
        }
        if (!zDelete && C19812.m45045().mo43871() && file.exists() && (strM15306 = C5553.m15306(file.getPath())) != null) {
            try {
                C0055.m955("/data/media/" + C11904.f39934.getName() + "/" + strM15306);
                return true;
            } catch (IOException unused2) {
            }
        }
        return zDelete;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo24646(AbstractC20745 abstractC20745) {
        String strMo24643 = abstractC20745.mo24643();
        File file = abstractC20745.mo36912() ? abstractC20745.mo36913().f50294 : new File(strMo24643);
        long jM36914 = m36914(abstractC20745);
        if (!this.f50294.renameTo(file)) {
            byte[] bArrM36910 = m36910();
            if (bArrM36910 != null) {
                if (!Features3.rename(m46737(), bArrM36910, strMo24643)) {
                    if (C19812.m45045().mo43871()) {
                        C7817 c7817M29947 = null;
                        try {
                            c7817M29947 = C12051.m29947(false);
                            if (!c7817M29947.m20596()) {
                                c7817M29947.m20606();
                                return false;
                            }
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byteArrayOutputStream.write(m46737().getBytes());
                            byteArrayOutputStream.write(47);
                            byteArrayOutputStream.write(bArrM36910);
                            c7817M29947.m20586(byteArrayOutputStream.toByteArray(), strMo24643.getBytes());
                            c7817M29947.m20606();
                        } catch (IOException unused) {
                            if (c7817M29947 != null) {
                                c7817M29947.m20606();
                            }
                        } catch (Throwable th) {
                            if (c7817M29947 != null) {
                                c7817M29947.m20606();
                            }
                            throw th;
                        }
                    }
                }
            }
            return false;
        }
        if (jM36914 < 0) {
            return true;
        }
        try {
            if (file.setLastModified(jM36914)) {
                return true;
            }
            file.toString();
            return true;
        } catch (RuntimeException unused2) {
            C13638.toString(file);
            return true;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m36914(AbstractC20745 abstractC20745) {
        if (!this.f50295 && abstractC20745.mo36912() && !abstractC20745.mo36913().f50295) {
            File file = this.f50294;
            try {
                return Features3.m57(file.getPath());
            } catch (IOException | RuntimeException unused) {
                C13638.toString(file);
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۫ܰ, reason: not valid java name and contains not printable characters */
    private boolean m36911() {
        byte[] bArrM36910 = m36910();
        if (bArrM36910 != null) {
            if (Features3.delete(m46737(), bArrM36910)) {
                return true;
            }
            if (C19812.m45045().mo43871()) {
                C7817 c7817M29947 = null;
                try {
                    c7817M29947 = C12051.m29947(false);
                    if (c7817M29947.m20596()) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(m46737().getBytes());
                        byteArrayOutputStream.write(47);
                        byteArrayOutputStream.write(bArrM36910);
                        c7817M29947.m20603(byteArrayOutputStream.toByteArray());
                        c7817M29947.m20606();
                        return true;
                    }
                } catch (IOException unused) {
                    if (c7817M29947 != null) {
                    }
                    return false;
                } catch (Throwable th) {
                    if (c7817M29947 != null) {
                        c7817M29947.m20606();
                    }
                    throw th;
                }
                c7817M29947.m20606();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    private byte[] m36910() {
        String name = this.f50294.getName();
        if (!C22851.m50588(name)) {
            return null;
        }
        for (byte[] bArr : Features3.listGarbledFileNames(m46737())) {
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

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo33975() {
        return this.f50294.exists();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۟ۙ */
    public final boolean mo33971() {
        return this.f50294.isFile();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۤۙ */
    public final boolean mo33974() {
        return this.f50294.isDirectory();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ᩵ۙ */
    public final boolean mo33988() {
        File file = this.f50294;
        return file.isFile() || file.isDirectory();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ֫ۙ */
    public final long mo33964() {
        return this.f50294.length();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ᩻ۙ */
    public final long mo33991() {
        return this.f50294.lastModified();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo32855(long j) {
        if (j < 0) {
            return false;
        }
        return this.f50294.setLastModified(j);
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۚۙ */
    public final String mo33968() {
        String strM59 = this.f50293;
        if (strM59 == null) {
            strM59 = Features3.m59(this.f50294.getAbsolutePath());
            if (strM59 == null) {
                strM59 = "";
            }
            this.f50293 = strM59;
        }
        if (strM59.isEmpty()) {
            return null;
        }
        return strM59;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo8449() {
        return this.f50294.canRead();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo32858() {
        return !this.f50295;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo8447() {
        return this.f50294.canWrite();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3810 mo8444(InterfaceC12984 interfaceC12984) {
        return new C23193(this, interfaceC12984);
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܰ */
    public List mo33983(final boolean z) {
        File[] fileArrListFiles = this.f50294.listFiles();
        if (fileArrListFiles == null) {
            return new ArrayList();
        }
        int i = 0;
        return (List) C20318.stream(fileArrListFiles).filter(new Predicate() { // from class: l.֨᩵ۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return z || !((File) obj).getName().startsWith(".");
            }
        }).map(new C13315(i)).map(new C4141(i)).collect(C1890.toList());
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۢۙ */
    public final List mo33973() {
        String[] list = this.f50294.list();
        if (list == null) {
            return new ArrayList();
        }
        return (List) C20318.stream(list).filter(new C6964(0)).collect(C1890.toList());
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۜܰ */
    public final InputStream mo33970() {
        return new C21144(this.f50294);
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۨ */
    public final OutputStream mo33976(boolean z) {
        return new FileOutputStream(this.f50294, z);
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۬ܰ */
    public final FileChannel mo33982() {
        return C6001.convertMaybeLegacyFileChannelFromLibrary(new RandomAccessFile(this.f50294, "r").getChannel());
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC21850 mo33966(String str) {
        return C19734.m44889(this.f50294, str);
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۬ */
    public final ParcelFileDescriptor mo33981(String str) {
        return ParcelFileDescriptor.open(this.f50294, C22383.m49657(str));
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۡܰ */
    public boolean mo35233() {
        return !this.f50295;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܰ */
    public boolean mo35234(InterfaceC5614 interfaceC5614) {
        C16137 c16137M38196;
        if (mo35233() && (c16137M38196 = C16137.m38196(this, interfaceC5614)) != null) {
            AbstractC20745 abstractC20745M38203 = c16137M38196.m38203();
            AbstractC20745 abstractC20745M46711 = abstractC20745M38203.m46711();
            if (abstractC20745M46711.mo33987()) {
                if (!mo24646(abstractC20745M38203)) {
                    abstractC20745M46711.mo24647();
                    return false;
                }
                if (c16137M38196.m38206()) {
                    return true;
                }
                abstractC20745M38203.mo24646(this);
                abstractC20745M46711.mo24647();
                return false;
            }
        }
        return false;
    }
}
