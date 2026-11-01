package l;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import bin.mt.plus.Features3;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܰ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O17J */
/* JADX INFO: loaded from: classes4.dex */
public class C14042 extends AbstractC20745 implements InterfaceC16034 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f46167;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f46168;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final File f46169;

    /* JADX INFO: renamed from: ֫ܰ */
    public boolean mo24642() {
        return false;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C14042 mo33969() {
        return this;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۤܰ */
    public boolean mo8448() {
        return true;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo33979() {
        return true;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean mo33985() {
        return true;
    }

    /* JADX INFO: renamed from: ܿܰ */
    public void mo24648() {
    }

    /* JADX INFO: renamed from: ᩻ܰ */
    public C5574 mo24649() {
        return null;
    }

    public C14042(File file, boolean z) {
        this.f46169 = file;
        this.f46167 = z;
        this.f46168 = z || C8272.m21690(file.getPath()) != null;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ֫ */
    public AbstractC20745 mo24641() {
        return new C14042(this.f46169.getAbsoluteFile(), this.f46167);
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۙۙ */
    public String mo24643() {
        return this.f46169.getAbsolutePath();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean mo33978() {
        if (!mo33975()) {
            if (this.f46167) {
                try {
                    return this.f46169.createNewFile();
                } catch (IOException unused) {
                }
            } else {
                C7817 c7817Mo8443 = null;
                try {
                    try {
                        c7817Mo8443 = mo8443();
                        c7817Mo8443.m20591(this.f46169.getPath(), false).close();
                        try {
                            c7817Mo8443.m20582(this.f46169.getPath(), 420, false, false);
                            c7817Mo8443.m20581(this.f46169.getPath(), 0, 0, false, false);
                        } catch (IOException unused2) {
                        }
                        c7817Mo8443.f25728 = 0L;
                        return true;
                    } catch (Throwable th) {
                        if (c7817Mo8443 != null) {
                            c7817Mo8443.f25728 = 0L;
                        }
                        throw th;
                    }
                } catch (IOException unused3) {
                    if (c7817Mo8443 != null) {
                        c7817Mo8443.f25728 = 0L;
                    }
                }
            }
        }
        return false;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo33987() {
        if (this.f46167) {
            if (this.f46169.exists()) {
                return this.f46169.isDirectory();
            }
            if (this.f46169.mkdirs()) {
                return true;
            }
        }
        C7817 c7817Mo8443 = null;
        try {
            c7817Mo8443 = mo8443();
            c7817Mo8443.m20602(this.f46169.getPath(), true);
            c7817Mo8443.f25728 = 0L;
            return true;
        } catch (IOException unused) {
            if (c7817Mo8443 == null) {
                return false;
            }
            c7817Mo8443.f25728 = 0L;
            return false;
        } catch (Throwable th) {
            if (c7817Mo8443 != null) {
                c7817Mo8443.f25728 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC10868 mo33989() {
        return new C2751(this);
    }

    @Override // l.AbstractC20745
    public final String getName() {
        return this.f46169.getName();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final String mo33986() {
        return this.f46169.getPath();
    }

    @Override // l.AbstractC20745
    public final String getParent() {
        return this.f46169.getParent();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final String mo33968() {
        try {
            C5574 c5574Mo24649 = mo24649();
            if (c5574Mo24649 == null) {
                c5574Mo24649 = mo24645();
            }
            return c5574Mo24649.m15397();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo33977(String str) throws IOException {
        if (!this.f46167 || !C19812.m45045().mo43870()) {
            super.mo33977(str);
            return;
        }
        try {
            Os.symlink(str, this.f46169.getPath());
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean mo33972() {
        return !this.f46167 && m46729();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܿ */
    public boolean mo24647() {
        if (C15071.m36110(this.f46169)) {
            return true;
        }
        C7817 c7817Mo8443 = null;
        try {
            try {
                c7817Mo8443 = mo8443();
                c7817Mo8443.m20611(this.f46169.getPath());
                c7817Mo8443.f25728 = 0L;
                return true;
            } catch (IOException unused) {
                if (m33963(c7817Mo8443)) {
                    if (c7817Mo8443 != null) {
                        c7817Mo8443.f25728 = 0L;
                    }
                    return true;
                }
                if (c7817Mo8443 == null) {
                    return false;
                }
                c7817Mo8443.f25728 = 0L;
                return false;
            }
        } catch (Throwable th) {
            if (c7817Mo8443 != null) {
                c7817Mo8443.f25728 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۛ */
    public boolean mo24644() {
        C7817 c7817Mo8443 = null;
        try {
            try {
                c7817Mo8443 = mo8443();
                c7817Mo8443.m20611(this.f46169.getPath());
                c7817Mo8443.f25728 = 0L;
                return true;
            } catch (IOException unused) {
                if (m33963(c7817Mo8443)) {
                    if (c7817Mo8443 != null) {
                        c7817Mo8443.f25728 = 0L;
                    }
                    return true;
                }
                boolean zDelete = this.f46169.delete();
                if (c7817Mo8443 != null) {
                    c7817Mo8443.f25728 = 0L;
                }
                return zDelete;
            }
        } catch (Throwable th) {
            if (c7817Mo8443 != null) {
                c7817Mo8443.f25728 = 0L;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:21:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܰ */
    public boolean mo24646(AbstractC20745 abstractC20745) {
        boolean z;
        String strMo24643 = abstractC20745.mo24643();
        if (this.f46169.renameTo(new File(strMo24643))) {
            return true;
        }
        C7817 c7817Mo8443 = null;
        try {
            try {
                c7817Mo8443 = mo8443();
                c7817Mo8443.m20594(this.f46169.getPath(), strMo24643);
                c7817Mo8443.f25728 = 0L;
                return true;
            } catch (IOException unused) {
                byte[] bArrM33962 = m33962(c7817Mo8443);
                if (bArrM33962 != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(m46737().getBytes());
                        byteArrayOutputStream.write(47);
                        byteArrayOutputStream.write(bArrM33962);
                        c7817Mo8443.m20586(byteArrayOutputStream.toByteArray(), strMo24643.getBytes());
                        z = true;
                    } catch (IOException unused2) {
                        z = false;
                        if (z) {
                            if (c7817Mo8443 != null) {
                                c7817Mo8443.f25728 = 0L;
                            }
                            return true;
                        }
                        if (c7817Mo8443 != null) {
                            c7817Mo8443.f25728 = 0L;
                        }
                        return false;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    if (c7817Mo8443 != null) {
                        c7817Mo8443.f25728 = 0L;
                    }
                    return true;
                }
                if (c7817Mo8443 != null) {
                    c7817Mo8443.f25728 = 0L;
                }
                return false;
            }
        } catch (Throwable th) {
            if (c7817Mo8443 != null) {
                c7817Mo8443.f25728 = 0L;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m33963(C7817 c7817) {
        byte[] bArrM33962 = m33962(c7817);
        if (bArrM33962 == null) {
            return false;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(m46737().getBytes());
            byteArrayOutputStream.write(47);
            byteArrayOutputStream.write(bArrM33962);
            c7817.m20603(byteArrayOutputStream.toByteArray());
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private byte[] m33962(C7817 c7817) {
        String name = this.f46169.getName();
        if (!C22851.m50588(name)) {
            return null;
        }
        try {
            for (byte[] bArr : c7817.m20609(m46737())) {
                if (name.equals(new String(bArr, StandardCharsets.UTF_8))) {
                    return bArr;
                }
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo33975() {
        if ((this.f46167 && this.f46169.exists()) || mo24642()) {
            return true;
        }
        if (!this.f46167 && this.f46169.exists()) {
            return true;
        }
        if (this.f46167 && m33961()) {
            return false;
        }
        C7817 c7817Mo8443 = null;
        try {
            c7817Mo8443 = mo8443();
            boolean zM20587 = c7817Mo8443.m20587(this.f46169.getPath());
            c7817Mo8443.f25728 = 0L;
            return zM20587;
        } catch (IOException unused) {
            if (c7817Mo8443 == null) {
                return false;
            }
            c7817Mo8443.f25728 = 0L;
            return false;
        } catch (Throwable th) {
            if (c7817Mo8443 != null) {
                c7817Mo8443.f25728 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo33971() {
        File file = this.f46169;
        boolean z = this.f46167;
        if (z && file.exists()) {
            return file.isFile();
        }
        if (!mo24642() && file.isFile()) {
            return true;
        }
        if (z && m33961()) {
            return false;
        }
        try {
            C5574 c5574Mo24645 = mo24645();
            char cM15393 = c5574Mo24645.m15393();
            if (cM15393 == 'l') {
                cM15393 = c5574Mo24645.m15395();
            }
            return cM15393 == '-';
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo33974() {
        File file = this.f46169;
        boolean z = this.f46167;
        if (z && file.exists()) {
            return file.isDirectory();
        }
        if (!mo24642() && file.isDirectory()) {
            return true;
        }
        if (z && m33961()) {
            return false;
        }
        try {
            C5574 c5574Mo24645 = mo24645();
            char cM15393 = c5574Mo24645.m15393();
            if (cM15393 == 'l') {
                cM15393 = c5574Mo24645.m15395();
            }
            return cM15393 == 'd';
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo33988() {
        if (this.f46167 && this.f46169.exists()) {
            return true;
        }
        try {
            C5574 c5574Mo24645 = mo24645();
            char cM15393 = c5574Mo24645.m15393();
            if (cM15393 == 'l') {
                cM15393 = c5574Mo24645.m15395();
            }
            return cM15393 == '-' || cM15393 == 'd';
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final long mo33964() {
        boolean z = this.f46167;
        File file = this.f46169;
        if (z && file.exists()) {
            return file.length();
        }
        if (!mo24642()) {
            long length = file.length();
            if (length > 0) {
                return length;
            }
        }
        try {
            return mo24645().m15391();
        } catch (IOException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: ۫ܰ, reason: not valid java name and contains not printable characters */
    public final long m33980() {
        C7817 c7817Mo8443 = null;
        try {
            c7817Mo8443 = mo8443();
            long jM20598 = c7817Mo8443.m20598(this.f46169.getPath());
            c7817Mo8443.f25728 = 0L;
            return jM20598;
        } catch (IOException unused) {
            if (c7817Mo8443 == null) {
                return -1L;
            }
            c7817Mo8443.f25728 = 0L;
            return -1L;
        } catch (Throwable th) {
            if (c7817Mo8443 != null) {
                c7817Mo8443.f25728 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final long mo33991() {
        if (this.f46167 || !mo24642()) {
            try {
                return Features3.m57(this.f46169.getPath());
            } catch (IOException unused) {
            }
        }
        try {
            return mo24645().m15394();
        } catch (IOException unused2) {
            return 0L;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo32855(long j) {
        if (j < 0) {
            return false;
        }
        if (this.f46167 && this.f46169.exists()) {
            return this.f46169.setLastModified(j);
        }
        if (this.f46169.setLastModified(j)) {
            return true;
        }
        C7817 c7817Mo8443 = null;
        try {
            c7817Mo8443 = mo8443();
            c7817Mo8443.m20580(j, this.f46169.getPath());
            c7817Mo8443.f25728 = 0L;
            return true;
        } catch (IOException unused) {
            if (c7817Mo8443 == null) {
                return false;
            }
            c7817Mo8443.f25728 = 0L;
            return false;
        } catch (Throwable th) {
            if (c7817Mo8443 != null) {
                c7817Mo8443.f25728 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ᩴ */
    public boolean mo8449() {
        if (this.f46169.canRead()) {
            return true;
        }
        return mo33975() && C19812.m45045().mo43869();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۟ */
    public boolean mo8447() {
        AbstractC20745 abstractC20745M46689;
        if (this.f46169.canWrite() || C19812.m45045().mo43871()) {
            return true;
        }
        return C19812.m45045().mo43870() && (abstractC20745M46689 = m46689()) != null && abstractC20745M46689.mo33975();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۙ */
    public AbstractC3810 mo8444(InterfaceC12984 interfaceC12984) {
        return new C4868(this, this, interfaceC12984);
    }

    /* JADX INFO: renamed from: ۧܰ */
    public C5574 mo24645() {
        C5574 c5574Mo24649 = mo24649();
        return c5574Mo24649 != null ? c5574Mo24649 : m33990();
    }

    /* JADX INFO: renamed from: ᩹ۨ, reason: not valid java name and contains not printable characters */
    public final C5574 m33990() throws Throwable {
        C7817 c7817Mo8443;
        try {
            c7817Mo8443 = mo8443();
            try {
                C5574 c5574M20595 = c7817Mo8443.m20595(this.f46169.getPath());
                c7817Mo8443.f25728 = 0L;
                return c5574M20595;
            } catch (Throwable th) {
                th = th;
                if (c7817Mo8443 != null) {
                    c7817Mo8443.f25728 = 0L;
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c7817Mo8443 = null;
        }
    }

    /* JADX INFO: renamed from: ܳܰ, reason: not valid java name and contains not printable characters */
    public final C5574 m33984() {
        return mo24645();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List mo33983(boolean z) {
        if (this.f46167 && m33961()) {
            return new C15432(this.f46169).mo33983(z);
        }
        C7817 c7817Mo8443 = null;
        try {
            try {
                c7817Mo8443 = mo8443();
                List list = (List) C9030.stream(c7817Mo8443.m20576(this.f46169.getPath(), z)).map(new Function() { // from class: l.ۗܺۚ
                    @Override // java.util.function.Function
                    /* JADX INFO: renamed from: andThen */
                    public /* synthetic */ Function mo33696andThen(Function function) {
                        return C4277.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return this.f12349.mo8446((C5574) obj);
                    }

                    @Override // java.util.function.Function
                    public /* synthetic */ Function compose(Function function) {
                        return C4277.$default$compose(this, function);
                    }
                }).collect(C1890.toList());
                c7817Mo8443.f25728 = 0L;
                return list;
            } catch (IOException unused) {
                ArrayList arrayList = new ArrayList();
                if (c7817Mo8443 != null) {
                    c7817Mo8443.f25728 = 0L;
                }
                return arrayList;
            }
        } catch (Throwable th) {
            if (c7817Mo8443 != null) {
                c7817Mo8443.f25728 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final List mo33973() {
        if (this.f46167 && m33961()) {
            return new C15432(this.f46169).mo33973();
        }
        C7817 c7817Mo8443 = null;
        try {
            try {
                c7817Mo8443 = mo8443();
                List listM20589 = c7817Mo8443.m20589(this.f46169.getPath());
                c7817Mo8443.f25728 = 0L;
                return listM20589;
            } catch (IOException unused) {
                ArrayList arrayList = new ArrayList();
                if (c7817Mo8443 != null) {
                    c7817Mo8443.f25728 = 0L;
                }
                return arrayList;
            }
        } catch (Throwable th) {
            if (c7817Mo8443 != null) {
                c7817Mo8443.f25728 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public final InputStream mo33970() throws Throwable {
        C7817 c7817Mo8443;
        try {
            return new C21144(this.f46169.getPath());
        } catch (FileNotFoundException unused) {
            try {
                c7817Mo8443 = mo8443();
                try {
                    InputStream inputStreamM20570 = c7817Mo8443.m20570(this.f46169.getPath());
                    c7817Mo8443.f25728 = 0L;
                    return inputStreamM20570;
                } catch (Throwable th) {
                    th = th;
                    if (c7817Mo8443 != null) {
                        c7817Mo8443.f25728 = 0L;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c7817Mo8443 = null;
            }
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final OutputStream mo33976(boolean z) throws Throwable {
        C7817 c7817Mo8443;
        try {
            return new FileOutputStream(this.f46169, z);
        } catch (FileNotFoundException e) {
            if (this.f46167 && e.getCause() == null) {
                throw e;
            }
            try {
                c7817Mo8443 = mo8443();
                try {
                    OutputStream outputStreamM20591 = c7817Mo8443.m20591(this.f46169.getPath(), z);
                    c7817Mo8443.f25728 = 0L;
                    return outputStreamM20591;
                } catch (Throwable th) {
                    th = th;
                    if (c7817Mo8443 != null) {
                        c7817Mo8443.f25728 = 0L;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c7817Mo8443 = null;
            }
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public final FileChannel mo33982() {
        try {
            return C6001.convertMaybeLegacyFileChannelFromLibrary(new RandomAccessFile(this.f46169, "r").getChannel());
        } catch (IOException e) {
            if (this.f46167 && e.getCause() == null) {
                throw e;
            }
            throw new IOException("Unsupported");
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21850 mo33966(String str) throws Throwable {
        C7817 c7817Mo8443;
        try {
            return C19734.m44889(this.f46169, str);
        } catch (FileNotFoundException e) {
            if (this.f46167 && e.getCause() == null) {
                throw e;
            }
            try {
                c7817Mo8443 = mo8443();
                try {
                    InterfaceC21850 interfaceC21850M20575 = c7817Mo8443.m20575(this.f46169.getPath(), str);
                    c7817Mo8443.f25728 = 0L;
                    return interfaceC21850M20575;
                } catch (Throwable th) {
                    th = th;
                    if (c7817Mo8443 != null) {
                        c7817Mo8443.f25728 = 0L;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c7817Mo8443 = null;
            }
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ParcelFileDescriptor mo33981(String str) throws Throwable {
        C7817 c7817Mo8443;
        try {
            return ParcelFileDescriptor.open(this.f46169, C22383.m49657(str));
        } catch (FileNotFoundException e) {
            if (this.f46167 && e.getCause() == null) {
                throw e;
            }
            try {
                c7817Mo8443 = mo8443();
                try {
                    String path = this.f46169.getPath();
                    c7817Mo8443.getClass();
                    if (C19812.m45049(str)) {
                        path = C19812.m45052(path);
                    }
                    ParcelFileDescriptor parcelFileDescriptorM20599 = c7817Mo8443.m20599(path, str);
                    c7817Mo8443.f25728 = 0L;
                    return parcelFileDescriptorM20599;
                } catch (Throwable th) {
                    th = th;
                    if (c7817Mo8443 != null) {
                        c7817Mo8443.f25728 = 0L;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c7817Mo8443 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC20745 mo8445() {
        return new C9684(this.f46169, this.f46167, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ */
    public AbstractC20745 mo8446(C5574 c5574) {
        File file = new File(this.f46169.getPath(), c5574.m15398());
        if (this.f46167) {
            return new C9684(file, true, c5574);
        }
        AbstractC20745 abstractC20745M15311 = C5553.m15311(file);
        if (abstractC20745M15311.mo33979()) {
            return new C9684(file, abstractC20745M15311.mo33969().f46167, c5574);
        }
        return abstractC20745M15311 instanceof InterfaceC16034 ? ((InterfaceC16034) abstractC20745M15311).mo8445() : abstractC20745M15311;
    }

    /* JADX INFO: renamed from: ֡ܰ */
    public C7817 mo8443() {
        return C12051.m29947(this.f46168 && C19812.m45045().mo43870());
    }

    /* JADX INFO: renamed from: ֨ۨ, reason: not valid java name and contains not printable characters */
    private boolean m33961() {
        if (this.f46168 && C19812.m45045().mo43870()) {
            return C0510.m2400();
        }
        return C12051.m29950();
    }

    /* JADX INFO: renamed from: ۙۨ, reason: not valid java name and contains not printable characters */
    public final boolean m33967() {
        return this.f46167;
    }

    /* JADX INFO: renamed from: ۗܰ, reason: not valid java name and contains not printable characters */
    public final boolean m33965() {
        return this.f46168;
    }
}
