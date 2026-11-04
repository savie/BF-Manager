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

/* JADX INFO: renamed from: l.ۜܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: O17J */
/* JADX INFO: loaded from: classes4.dex */
public class C7302 extends AbstractC22044 implements InterfaceC6557 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f24037;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f24038;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final File f24039;

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۛ᩷ */
    public boolean mo2945() {
        return true;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo19981() {
        return true;
    }

    /* JADX INFO: renamed from: ۠᩷ */
    public boolean mo15566() {
        return false;
    }

    /* JADX INFO: renamed from: ۡ᩷ */
    public C21694 mo15567() {
        return null;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7302 mo19983() {
        return this;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo4293() {
        return true;
    }

    /* JADX INFO: renamed from: ᩳ᩷ */
    public void mo15568() {
    }

    public C7302(File file, boolean z) {
        this.f24039 = file;
        this.f24038 = z;
        this.f24037 = z || C17743.m41554(file.getPath()) != null;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۠ */
    public AbstractC22044 mo4284() {
        return new C7302(this.f24039.getAbsoluteFile(), this.f24038);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙۙ */
    public String mo4278() {
        return this.f24039.getAbsolutePath();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo4283() {
        if (!mo2934()) {
            if (this.f24038) {
                try {
                    return this.f24039.createNewFile();
                } catch (IOException unused) {
                }
            } else {
                C15945 c15945Mo19986 = null;
                try {
                    try {
                        c15945Mo19986 = mo19986();
                        c15945Mo19986.m38037(this.f24039.getPath(), false).close();
                        try {
                            c15945Mo19986.m38027(this.f24039.getPath(), 420, false, false);
                            c15945Mo19986.m38026(this.f24039.getPath(), 0, 0, false, false);
                        } catch (IOException unused2) {
                        }
                        c15945Mo19986.f51784 = 0L;
                        return true;
                    } catch (Throwable th) {
                        if (c15945Mo19986 != null) {
                            c15945Mo19986.f51784 = 0L;
                        }
                        throw th;
                    }
                } catch (IOException unused3) {
                    if (c15945Mo19986 != null) {
                        c15945Mo19986.f51784 = 0L;
                    }
                }
            }
        }
        return false;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo4274() {
        if (this.f24038) {
            if (this.f24039.exists()) {
                return this.f24039.isDirectory();
            }
            if (this.f24039.mkdirs()) {
                return true;
            }
        }
        C15945 c15945Mo19986 = null;
        try {
            c15945Mo19986 = mo19986();
            c15945Mo19986.m38056(this.f24039.getPath(), true);
            c15945Mo19986.f51784 = 0L;
            return true;
        } catch (IOException unused) {
            if (c15945Mo19986 == null) {
                return false;
            }
            c15945Mo19986.f51784 = 0L;
            return false;
        } catch (Throwable th) {
            if (c15945Mo19986 != null) {
                c15945Mo19986.f51784 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC11601 mo4298() {
        return new C4540(this);
    }

    @Override // l.AbstractC22044
    public final String getName() {
        return this.f24039.getName();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ܺۙ */
    public final String mo4294() {
        return this.f24039.getPath();
    }

    @Override // l.AbstractC22044
    public final String getParent() {
        return this.f24039.getParent();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩴۙ */
    public final String mo2954() {
        try {
            C21694 c21694Mo15567 = mo15567();
            if (c21694Mo15567 == null) {
                c21694Mo15567 = mo15564();
            }
            return c21694Mo15567.m49240();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۤ */
    public final void mo2946(String str) throws IOException {
        if (!this.f24038 || !C4013.m12986().mo29538()) {
            super.mo2946(str);
            return;
        }
        try {
            Os.symlink(str, this.f24039.getPath());
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo4291() {
        return !this.f24038 && m49870();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩳ */
    public boolean mo4296() {
        if (C0147.m1307(this.f24039)) {
            return true;
        }
        C15945 c15945Mo19986 = null;
        try {
            try {
                c15945Mo19986 = mo19986();
                c15945Mo19986.m38062(this.f24039.getPath());
                c15945Mo19986.f51784 = 0L;
                return true;
            } catch (IOException unused) {
                if (m19977(c15945Mo19986)) {
                    if (c15945Mo19986 != null) {
                        c15945Mo19986.f51784 = 0L;
                    }
                    return true;
                }
                if (c15945Mo19986 == null) {
                    return false;
                }
                c15945Mo19986.f51784 = 0L;
                return false;
            }
        } catch (Throwable th) {
            if (c15945Mo19986 != null) {
                c15945Mo19986.f51784 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۢ */
    public boolean mo4287() {
        C15945 c15945Mo19986 = null;
        try {
            try {
                c15945Mo19986 = mo19986();
                c15945Mo19986.m38062(this.f24039.getPath());
                c15945Mo19986.f51784 = 0L;
                return true;
            } catch (IOException unused) {
                if (m19977(c15945Mo19986)) {
                    if (c15945Mo19986 != null) {
                        c15945Mo19986.f51784 = 0L;
                    }
                    return true;
                }
                boolean zDelete = this.f24039.delete();
                if (c15945Mo19986 != null) {
                    c15945Mo19986.f51784 = 0L;
                }
                return zDelete;
            }
        } catch (Throwable th) {
            if (c15945Mo19986 != null) {
                c15945Mo19986.f51784 = 0L;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:21:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩷ */
    public boolean mo4301(AbstractC22044 abstractC22044) {
        boolean z;
        String strMo4278 = abstractC22044.mo4278();
        if (this.f24039.renameTo(new File(strMo4278))) {
            return true;
        }
        C15945 c15945Mo19986 = null;
        try {
            try {
                c15945Mo19986 = mo19986();
                c15945Mo19986.m38039(this.f24039.getPath(), strMo4278);
                c15945Mo19986.f51784 = 0L;
                return true;
            } catch (IOException unused) {
                byte[] bArrM19975 = m19975(c15945Mo19986);
                if (bArrM19975 != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(m49881().getBytes());
                        byteArrayOutputStream.write(47);
                        byteArrayOutputStream.write(bArrM19975);
                        c15945Mo19986.m38031(byteArrayOutputStream.toByteArray(), strMo4278.getBytes());
                        z = true;
                    } catch (IOException unused2) {
                        z = false;
                        if (z) {
                            if (c15945Mo19986 != null) {
                                c15945Mo19986.f51784 = 0L;
                            }
                            return true;
                        }
                        if (c15945Mo19986 != null) {
                            c15945Mo19986.f51784 = 0L;
                        }
                        return false;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    if (c15945Mo19986 != null) {
                        c15945Mo19986.f51784 = 0L;
                    }
                    return true;
                }
                if (c15945Mo19986 != null) {
                    c15945Mo19986.f51784 = 0L;
                }
                return false;
            }
        } catch (Throwable th) {
            if (c15945Mo19986 != null) {
                c15945Mo19986.f51784 = 0L;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m19977(C15945 c15945) {
        byte[] bArrM19975 = m19975(c15945);
        if (bArrM19975 == null) {
            return false;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(m49881().getBytes());
            byteArrayOutputStream.write(47);
            byteArrayOutputStream.write(bArrM19975);
            c15945.m38057(byteArrayOutputStream.toByteArray());
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private byte[] m19975(C15945 c15945) {
        String name = this.f24039.getName();
        if (!C18856.m43751(name)) {
            return null;
        }
        try {
            for (byte[] bArr : c15945.m38043(m49881())) {
                if (name.equals(new String(bArr, StandardCharsets.UTF_8))) {
                    return bArr;
                }
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2934() {
        if ((this.f24038 && this.f24039.exists()) || mo15566()) {
            return true;
        }
        if (!this.f24038 && this.f24039.exists()) {
            return true;
        }
        if (this.f24038 && m19976()) {
            return false;
        }
        C15945 c15945Mo19986 = null;
        try {
            c15945Mo19986 = mo19986();
            boolean zM38032 = c15945Mo19986.m38032(this.f24039.getPath());
            c15945Mo19986.f51784 = 0L;
            return zM38032;
        } catch (IOException unused) {
            if (c15945Mo19986 == null) {
                return false;
            }
            c15945Mo19986.f51784 = 0L;
            return false;
        } catch (Throwable th) {
            if (c15945Mo19986 != null) {
                c15945Mo19986.f51784 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩺ۙ */
    public final boolean mo4304() {
        File file = this.f24039;
        boolean z = this.f24038;
        if (z && file.exists()) {
            return file.isFile();
        }
        if (!mo15566() && file.isFile()) {
            return true;
        }
        if (z && m19976()) {
            return false;
        }
        try {
            C21694 c21694Mo15564 = mo15564();
            char cM49239 = c21694Mo15564.m49239();
            if (cM49239 == 'l') {
                cM49239 = c21694Mo15564.m49235();
            }
            return cM49239 == '-';
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۛۙ */
    public final boolean mo4281() {
        File file = this.f24039;
        boolean z = this.f24038;
        if (z && file.exists()) {
            return file.isDirectory();
        }
        if (!mo15566() && file.isDirectory()) {
            return true;
        }
        if (z && m19976()) {
            return false;
        }
        try {
            C21694 c21694Mo15564 = mo15564();
            char cM49239 = c21694Mo15564.m49239();
            if (cM49239 == 'l') {
                cM49239 = c21694Mo15564.m49235();
            }
            return cM49239 == 'd';
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩵ۙ */
    public final boolean mo4297() {
        if (this.f24038 && this.f24039.exists()) {
            return true;
        }
        try {
            C21694 c21694Mo15564 = mo15564();
            char cM49239 = c21694Mo15564.m49239();
            if (cM49239 == 'l') {
                cM49239 = c21694Mo15564.m49235();
            }
            return cM49239 == '-' || cM49239 == 'd';
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۠ۙ */
    public final long mo4285() {
        boolean z = this.f24038;
        File file = this.f24039;
        if (z && file.exists()) {
            return file.length();
        }
        if (!mo15566()) {
            long length = file.length();
            if (length > 0) {
                return length;
            }
        }
        try {
            return mo15564().m49232();
        } catch (IOException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: ۟᩷, reason: not valid java name and contains not printable characters */
    public final long m19982() {
        C15945 c15945Mo19986 = null;
        try {
            c15945Mo19986 = mo19986();
            long jM38051 = c15945Mo19986.m38051(this.f24039.getPath());
            c15945Mo19986.f51784 = 0L;
            return jM38051;
        } catch (IOException unused) {
            if (c15945Mo19986 == null) {
                return -1L;
            }
            c15945Mo19986.f51784 = 0L;
            return -1L;
        } catch (Throwable th) {
            if (c15945Mo19986 != null) {
                c15945Mo19986.f51784 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۡۙ */
    public final long mo4286() {
        if (this.f24038 || !mo15566()) {
            try {
                return Features3.m46(this.f24039.getPath());
            } catch (IOException unused) {
            }
        }
        try {
            return mo15564().m49236();
        } catch (IOException unused2) {
            return 0L;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2942(long j) {
        if (j < 0) {
            return false;
        }
        if (this.f24038 && this.f24039.exists()) {
            return this.f24039.setLastModified(j);
        }
        if (this.f24039.setLastModified(j)) {
            return true;
        }
        C15945 c15945Mo19986 = null;
        try {
            c15945Mo19986 = mo19986();
            c15945Mo19986.m38025(j, this.f24039.getPath());
            c15945Mo19986.f51784 = 0L;
            return true;
        } catch (IOException unused) {
            if (c15945Mo19986 == null) {
                return false;
            }
            c15945Mo19986.f51784 = 0L;
            return false;
        } catch (Throwable th) {
            if (c15945Mo19986 != null) {
                c15945Mo19986.f51784 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩹ */
    public boolean mo4302() {
        if (this.f24039.canRead()) {
            return true;
        }
        return mo2934() && C4013.m12986().mo29537();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩺ */
    public boolean mo4303() {
        AbstractC22044 abstractC22044M49858;
        if (this.f24039.canWrite() || C4013.m12986().mo29539()) {
            return true;
        }
        return C4013.m12986().mo29538() && (abstractC22044M49858 = m49858()) != null && abstractC22044M49858.mo2934();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ */
    public AbstractC18555 mo2938(InterfaceC21539 interfaceC21539) {
        return new C8793(this, this, interfaceC21539);
    }

    /* JADX INFO: renamed from: ֨᩷ */
    public C21694 mo15564() {
        C21694 c21694Mo15567 = mo15567();
        return c21694Mo15567 != null ? c21694Mo15567 : m19984();
    }

    /* JADX INFO: renamed from: ۫ۤ, reason: not valid java name and contains not printable characters */
    public final C21694 m19984() throws Throwable {
        C15945 c15945Mo19986;
        try {
            c15945Mo19986 = mo19986();
            try {
                C21694 c21694M38034 = c15945Mo19986.m38034(this.f24039.getPath());
                c15945Mo19986.f51784 = 0L;
                return c21694M38034;
            } catch (Throwable th) {
                th = th;
                if (c15945Mo19986 != null) {
                    c15945Mo19986.f51784 = 0L;
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c15945Mo19986 = null;
        }
    }

    /* JADX INFO: renamed from: ۖ᩷, reason: not valid java name and contains not printable characters */
    public final C21694 m19978() {
        return mo15564();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩷ */
    public final List mo4299(boolean z) {
        if (this.f24038 && m19976()) {
            return new C1161(this.f24039).mo4299(z);
        }
        C15945 c15945Mo19986 = null;
        try {
            try {
                c15945Mo19986 = mo19986();
                List list = (List) C1170.stream(c15945Mo19986.m38021(this.f24039.getPath(), z)).map(new Function() { // from class: l.ۖܿᩴ
                    @Override // java.util.function.Function
                    /* JADX INFO: renamed from: andThen */
                    public /* synthetic */ Function mo10608andThen(Function function) {
                        return C24247.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return this.f9287.mo19979((C21694) obj);
                    }

                    @Override // java.util.function.Function
                    public /* synthetic */ Function compose(Function function) {
                        return C24247.$default$compose(this, function);
                    }
                }).collect(C2025.toList());
                c15945Mo19986.f51784 = 0L;
                return list;
            } catch (IOException unused) {
                ArrayList arrayList = new ArrayList();
                if (c15945Mo19986 != null) {
                    c15945Mo19986.f51784 = 0L;
                }
                return arrayList;
            }
        } catch (Throwable th) {
            if (c15945Mo19986 != null) {
                c15945Mo19986.f51784 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۜۙ */
    public final List mo4282() {
        if (this.f24038 && m19976()) {
            return new C1161(this.f24039).mo4282();
        }
        C15945 c15945Mo19986 = null;
        try {
            try {
                c15945Mo19986 = mo19986();
                List listM38049 = c15945Mo19986.m38049(this.f24039.getPath());
                c15945Mo19986.f51784 = 0L;
                return listM38049;
            } catch (IOException unused) {
                ArrayList arrayList = new ArrayList();
                if (c15945Mo19986 != null) {
                    c15945Mo19986.f51784 = 0L;
                }
                return arrayList;
            }
        } catch (Throwable th) {
            if (c15945Mo19986 != null) {
                c15945Mo19986.f51784 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۧ᩷ */
    public final InputStream mo4290() throws Throwable {
        C15945 c15945Mo19986;
        try {
            return new C16221(this.f24039.getPath());
        } catch (FileNotFoundException unused) {
            try {
                c15945Mo19986 = mo19986();
                try {
                    InputStream inputStreamM38041 = c15945Mo19986.m38041(this.f24039.getPath());
                    c15945Mo19986.f51784 = 0L;
                    return inputStreamM38041;
                } catch (Throwable th) {
                    th = th;
                    if (c15945Mo19986 != null) {
                        c15945Mo19986.f51784 = 0L;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c15945Mo19986 = null;
            }
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۤ */
    public final OutputStream mo4289(boolean z) throws Throwable {
        C15945 c15945Mo19986;
        try {
            return new FileOutputStream(this.f24039, z);
        } catch (FileNotFoundException e) {
            if (this.f24038 && e.getCause() == null) {
                throw e;
            }
            try {
                c15945Mo19986 = mo19986();
                try {
                    OutputStream outputStreamM38037 = c15945Mo19986.m38037(this.f24039.getPath(), z);
                    c15945Mo19986.f51784 = 0L;
                    return outputStreamM38037;
                } catch (Throwable th) {
                    th = th;
                    if (c15945Mo19986 != null) {
                        c15945Mo19986.f51784 = 0L;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c15945Mo19986 = null;
            }
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۚ᩷ */
    public final FileChannel mo4280() {
        try {
            return C19853.convertMaybeLegacyFileChannelFromLibrary(new RandomAccessFile(this.f24039, "r").getChannel());
        } catch (IOException e) {
            if (this.f24038 && e.getCause() == null) {
                throw e;
            }
            throw new IOException("Unsupported");
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15475 mo4276(String str) throws Throwable {
        C15945 c15945Mo19986;
        try {
            return C11746.m29497(this.f24039, str);
        } catch (FileNotFoundException e) {
            if (this.f24038 && e.getCause() == null) {
                throw e;
            }
            try {
                c15945Mo19986 = mo19986();
                try {
                    InterfaceC15475 interfaceC15475M38060 = c15945Mo19986.m38060(this.f24039.getPath(), str);
                    c15945Mo19986.f51784 = 0L;
                    return interfaceC15475M38060;
                } catch (Throwable th) {
                    th = th;
                    if (c15945Mo19986 != null) {
                        c15945Mo19986.f51784 = 0L;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c15945Mo19986 = null;
            }
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۚ */
    public final ParcelFileDescriptor mo4279(String str) throws Throwable {
        C15945 c15945Mo19986;
        try {
            return ParcelFileDescriptor.open(this.f24039, C22965.m51832(str));
        } catch (FileNotFoundException e) {
            if (this.f24038 && e.getCause() == null) {
                throw e;
            }
            try {
                c15945Mo19986 = mo19986();
                try {
                    String path = this.f24039.getPath();
                    c15945Mo19986.getClass();
                    if (C4013.m12979(str)) {
                        path = C4013.m12981(path);
                    }
                    ParcelFileDescriptor parcelFileDescriptorM38052 = c15945Mo19986.m38052(path, str);
                    c15945Mo19986.f51784 = 0L;
                    return parcelFileDescriptorM38052;
                } catch (Throwable th) {
                    th = th;
                    if (c15945Mo19986 != null) {
                        c15945Mo19986.f51784 = 0L;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c15945Mo19986 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC22044 mo15565() {
        return new C9538(this.f24039, this.f24038, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 mo19979(C21694 c21694) {
        File file = new File(this.f24039.getPath(), c21694.m49238());
        if (this.f24038) {
            return new C9538(file, true, c21694);
        }
        AbstractC22044 abstractC22044M35191 = C14584.m35191(file);
        if (abstractC22044M35191.mo19981()) {
            return new C9538(file, abstractC22044M35191.mo19983().f24038, c21694);
        }
        return abstractC22044M35191 instanceof InterfaceC6557 ? ((InterfaceC6557) abstractC22044M35191).mo15565() : abstractC22044M35191;
    }

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public C15945 mo19986() {
        return C7742.m21077(this.f24037 && C4013.m12986().mo29538());
    }

    /* JADX INFO: renamed from: ۚۤ, reason: not valid java name and contains not printable characters */
    private boolean m19976() {
        if (this.f24037 && C4013.m12986().mo29538()) {
            return C4319.m13812();
        }
        return C7742.m21080();
    }

    /* JADX INFO: renamed from: ۙۤ, reason: not valid java name and contains not printable characters */
    public final boolean m19980() {
        return this.f24038;
    }

    /* JADX INFO: renamed from: ۬᩷, reason: not valid java name and contains not printable characters */
    public final boolean m19985() {
        return this.f24037;
    }
}
