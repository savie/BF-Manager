package l;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩸ܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7CW */
/* JADX INFO: loaded from: classes5.dex */
public final class C21722 extends AbstractC18194 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final String f70419 = C4506.getDefault().getSeparator();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public PrintWriter f70420;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public File f70421;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public File f70422;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public EnumC15373 f70423;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public FileOutputStream f70424;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48468(File file, String str) {
        if (this.f70421 == null) {
            this.f70421 = file;
        }
        this.f70423 = EnumC15373.FILE;
        this.f58139 = str;
    }

    @Override // l.AbstractC18194, l.InterfaceC10434
    /* JADX INFO: renamed from: ۙ */
    public final void mo18525(String str, C11521 c11521, AbstractC0410 abstractC0410) {
        String strSubstring;
        String string;
        this.f58140 = str;
        int iLastIndexOf = str.lastIndexOf(f70419);
        if (iLastIndexOf != -1) {
            strSubstring = abstractC0410.m2147() ? "" : str.substring(0, iLastIndexOf);
            str = str.substring(iLastIndexOf + 1);
        } else {
            strSubstring = "";
        }
        String str2 = this.f58139;
        if (str2 != null) {
            StringBuilder sbM23356 = C9023.m23356(str2);
            sbM23356.append((String) c11521.orElse(""));
            string = sbM23356.toString();
        } else {
            StringBuilder sbM23357 = C9023.m23356(str);
            sbM23357.append((String) c11521.orElse(""));
            string = sbM23357.toString();
        }
        File file = this.f70421;
        if (file == null) {
            abstractC0410.m2146(C7997.m21055("writing to ", strSubstring, " ", string), new Object[0]);
            this.f70422 = new File(strSubstring, string);
        } else {
            this.f70422 = C22852.get(file.getPath(), strSubstring, string).toFile();
            abstractC0410.m2152(new Supplier() { // from class: l.᩺ܿۡ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return C21722.m48466(this.f75125);
                }
            });
            File file2 = new File(this.f70422.getParent());
            if (!file2.exists() && !file2.mkdirs()) {
                abstractC0410.mo2150("Cannot create {0}", file2.getPath());
                return;
            }
        }
        this.f70424 = new FileOutputStream(this.f70422);
        this.f70420 = new PrintWriter(new OutputStreamWriter(this.f70424));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48467(File file) {
        this.f70421 = file;
        if (this.f70423 == null) {
            this.f70423 = EnumC15373.DIR;
        }
    }

    public final String toString() {
        String string = super.toString();
        File file = this.f70421;
        if (file != null && this.f70422 != null) {
            String strConcat = string.concat(file != null ? file.toString() : "").concat(f70419);
            File file2 = this.f70422;
            strConcat.concat(file2 != null ? file2.toString() : "");
        }
        return string;
    }

    @Override // l.InterfaceC10434
    /* JADX INFO: renamed from: ۨ */
    public final void mo18527(String str) {
        this.f70420.println(str);
    }

    @Override // l.InterfaceC10434
    /* JADX INFO: renamed from: ۙ */
    public final void mo18524(String str) {
        this.f70420.print(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m48466(C21722 c21722) {
        return C0242.m1617("writing -d ", c21722.f70421.getPath(), " = \"", c21722.f70422.getAbsolutePath(), "\"");
    }

    @Override // l.AbstractC18194, l.InterfaceC10434
    /* JADX INFO: renamed from: ܰ */
    public final void mo18529(String str) throws IOException {
        super.mo18529(str);
        flush();
        try {
            PrintWriter printWriter = this.f70420;
            if (printWriter != null) {
                printWriter.close();
            }
        } finally {
            FileOutputStream fileOutputStream = this.f70424;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }

    @Override // l.InterfaceC10434
    public final void flush() {
        FileOutputStream fileOutputStream = this.f70424;
        if (fileOutputStream != null) {
            try {
                fileOutputStream.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // l.InterfaceC10434
    /* JADX INFO: renamed from: ۙ */
    public final DataOutputStream mo18523() {
        return new DataOutputStream(new BufferedOutputStream(this.f70424));
    }

    @Override // l.AbstractC18194
    /* JADX INFO: renamed from: ܰ */
    public final String mo18528() {
        File file = this.f70422;
        return file != null ? file.toString() : "file stream";
    }
}
