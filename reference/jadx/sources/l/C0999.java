package l;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.function.Supplier;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֨ۜۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7CW */
/* JADX INFO: loaded from: classes3.dex */
public final class C0999 extends AbstractC9201 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final String f3603 = C16869.getDefault().getSeparator();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public EnumC9947 f3604;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public PrintWriter f3605;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public FileOutputStream f3606;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public File f3607;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public File f3608;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3878(File file, String str) {
        if (this.f3608 == null) {
            this.f3608 = file;
        }
        this.f3604 = EnumC9947.FILE;
        this.f30010 = str;
    }

    @Override // l.AbstractC9201, l.InterfaceC13676
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3880(String str, C15867 c15867, AbstractC12931 abstractC12931) {
        String strSubstring;
        String string;
        this.f30011 = str;
        int iLastIndexOf = str.lastIndexOf(f3603);
        if (iLastIndexOf != -1) {
            strSubstring = abstractC12931.m32296() ? "" : str.substring(0, iLastIndexOf);
            str = str.substring(iLastIndexOf + 1);
        } else {
            strSubstring = "";
        }
        String str2 = this.f30010;
        if (str2 != null) {
            StringBuilder sbM27333 = C10732.m27333(str2);
            sbM27333.append((String) c15867.orElse(""));
            string = sbM27333.toString();
        } else {
            StringBuilder sbM27334 = C10732.m27333(str);
            sbM27334.append((String) c15867.orElse(""));
            string = sbM27334.toString();
        }
        File file = this.f3608;
        if (file == null) {
            abstractC12931.m32315(ExternalValue$$ExternalSyntheticOutline0.m("writing to ", strSubstring, " ", string), new Object[0]);
            this.f3607 = new File(strSubstring, string);
        } else {
            this.f3607 = C14631.get(file.getPath(), strSubstring, string).toFile();
            abstractC12931.m32299(new Supplier() { // from class: l.ᩳۜۛ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return C0999.m3875(this.f61316);
                }
            });
            File file2 = new File(this.f3607.getParent());
            if (!file2.exists() && !file2.mkdirs()) {
                abstractC12931.mo4160("Cannot create {0}", file2.getPath());
                return;
            }
        }
        this.f3606 = new FileOutputStream(this.f3607);
        this.f3605 = new PrintWriter(new OutputStreamWriter(this.f3606));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3877(File file) {
        this.f3608 = file;
        if (this.f3604 == null) {
            this.f3604 = EnumC9947.DIR;
        }
    }

    public final String toString() {
        String string = super.toString();
        File file = this.f3608;
        if (file != null && this.f3607 != null) {
            String strConcat = string.concat(file != null ? file.toString() : "").concat(f3603);
            File file2 = this.f3607;
            strConcat.concat(file2 != null ? file2.toString() : "");
        }
        return string;
    }

    @Override // l.InterfaceC13676
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo3881(String str) {
        this.f3605.println(str);
    }

    @Override // l.InterfaceC13676
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3879(String str) {
        this.f3605.print(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m3875(C0999 c0999) {
        return C3188.m10404("writing -d ", c0999.f3608.getPath(), " = \"", c0999.f3607.getAbsolutePath(), "\"");
    }

    @Override // l.AbstractC9201, l.InterfaceC13676
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo3883(String str) throws IOException {
        super.mo3883(str);
        flush();
        try {
            PrintWriter printWriter = this.f3605;
            if (printWriter != null) {
                printWriter.close();
            }
        } finally {
            FileOutputStream fileOutputStream = this.f3606;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }

    @Override // l.InterfaceC13676
    public final void flush() {
        FileOutputStream fileOutputStream = this.f3606;
        if (fileOutputStream != null) {
            try {
                fileOutputStream.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // l.InterfaceC13676
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DataOutputStream mo3876() {
        return new DataOutputStream(new BufferedOutputStream(this.f3606));
    }

    @Override // l.AbstractC9201
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String mo3882() {
        File file = this.f3607;
        return file != null ? file.toString() : "file stream";
    }
}
