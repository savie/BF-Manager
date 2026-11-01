package l;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: l.᩸ۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: FAO8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21559 implements XmlSerializer {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final byte[] f69997 = {65, 66, 88, 0};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18737 f69998;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String[] f69999;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f70000 = 0;

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getNamespace() {
        return "";
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m48270(int i, String str) throws IOException {
        if (str != null) {
            this.f69998.writeByte(i | 32);
            this.f69998.writeUTF(str);
        } else {
            this.f69998.writeByte(i | 16);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(OutputStream outputStream, String str) throws IOException {
        if (str != null && !StandardCharsets.UTF_8.name().equalsIgnoreCase(str)) {
            throw new UnsupportedOperationException();
        }
        C18737 c18737 = new C18737(outputStream);
        this.f69998 = c18737;
        c18737.write(f69997, 0, 4);
        this.f70000 = 0;
        this.f69999 = new String[8];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(Writer writer) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void flush() throws IOException {
        this.f69998.flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void startDocument(String str, Boolean bool) throws IOException {
        if (str != null && !StandardCharsets.UTF_8.name().equalsIgnoreCase(str)) {
            throw new UnsupportedOperationException();
        }
        if (bool != null && !bool.booleanValue()) {
            throw new UnsupportedOperationException();
        }
        this.f69998.writeByte(16);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void endDocument() throws IOException {
        this.f69998.writeByte(17);
        flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final int getDepth() {
        return this.f70000;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getName() {
        return this.f69999[this.f70000 - 1];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer startTag(String str, String str2) throws IOException {
        if (str != null && !str.isEmpty()) {
            m48269();
            throw null;
        }
        int i = this.f70000;
        String[] strArr = this.f69999;
        if (i == strArr.length) {
            this.f69999 = (String[]) Arrays.copyOf(strArr, i + (i >> 1));
        }
        String[] strArr2 = this.f69999;
        int i2 = this.f70000;
        this.f70000 = i2 + 1;
        strArr2[i2] = str2;
        this.f69998.writeByte(50);
        this.f69998.m43290(str2);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer endTag(String str, String str2) throws IOException {
        if (str != null && !str.isEmpty()) {
            m48269();
            throw null;
        }
        this.f70000--;
        this.f69998.writeByte(51);
        this.f69998.m43290(str2);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer attribute(String str, String str2, String str3) throws IOException {
        if (str != null && !str.isEmpty()) {
            m48269();
            throw null;
        }
        if (str3 == null) {
            this.f69998.writeByte(31);
            this.f69998.m43290(str2);
            return this;
        }
        this.f69998.writeByte(47);
        this.f69998.m43290(str2);
        this.f69998.writeUTF(str3);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48275(String str, String str2) throws IOException {
        this.f69998.writeByte(63);
        this.f69998.m43290(str);
        this.f69998.m43290(str2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48280(String str, byte[] bArr) throws IOException {
        this.f69998.writeByte(79);
        this.f69998.m43290(str);
        this.f69998.writeShort(bArr.length);
        C18737 c18737 = this.f69998;
        c18737.getClass();
        c18737.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48277(String str, byte[] bArr) throws IOException {
        this.f69998.writeByte(95);
        this.f69998.m43290(str);
        this.f69998.writeShort(bArr.length);
        C18737 c18737 = this.f69998;
        c18737.getClass();
        c18737.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48271(int i, String str) throws IOException {
        this.f69998.writeByte(UMErrorCode.E_UM_BE_CREATE_FAILED);
        this.f69998.m43290(str);
        this.f69998.writeInt(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48278(int i, String str) throws IOException {
        this.f69998.writeByte(127);
        this.f69998.m43290(str);
        this.f69998.writeInt(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48272(long j, String str) throws IOException {
        this.f69998.writeByte(143);
        this.f69998.m43290(str);
        this.f69998.writeLong(j);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48279(long j, String str) throws IOException {
        this.f69998.writeByte(159);
        this.f69998.m43290(str);
        this.f69998.writeLong(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48274(String str, float f) throws IOException {
        this.f69998.writeByte(HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS);
        this.f69998.m43290(str);
        this.f69998.writeFloat(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48273(String str, double d) throws IOException {
        this.f69998.writeByte(191);
        this.f69998.m43290(str);
        this.f69998.writeDouble(d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48276(String str, boolean z) throws IOException {
        if (z) {
            this.f69998.writeByte(207);
            this.f69998.m43290(str);
        } else {
            this.f69998.writeByte(223);
            this.f69998.m43290(str);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(char[] cArr, int i, int i2) throws IOException {
        m48270(4, new String(cArr, i, i2));
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(String str) throws IOException {
        m48270(4, str);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void cdsect(String str) throws IOException {
        m48270(5, str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void entityRef(String str) throws IOException {
        m48270(6, str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void processingInstruction(String str) throws IOException {
        m48270(8, str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void comment(String str) throws IOException {
        m48270(9, str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void docdecl(String str) throws IOException {
        m48270(10, str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void ignorableWhitespace(String str) throws IOException {
        m48270(7, str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setFeature(String str, boolean z) {
        if (!"http://xmlpull.org/v1/doc/features.html#indent-output".equals(str)) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setProperty(String str, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setPrefix(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getPrefix(String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48269() {
        throw new IllegalArgumentException("Namespaces are not supported");
    }
}
