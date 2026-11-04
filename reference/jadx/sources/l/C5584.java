package l;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: l.ۚۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: FAO8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5584 implements XmlSerializer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final byte[] f19390 = {65, 66, 88, 0};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11549 f19391;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String[] f19392;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f19393 = 0;

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getNamespace() {
        return "";
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m16547(int i, String str) throws IOException {
        if (str != null) {
            this.f19391.writeByte(i | 32);
            this.f19391.writeUTF(str);
        } else {
            this.f19391.writeByte(i | 16);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(OutputStream outputStream, String str) throws IOException {
        if (str != null && !StandardCharsets.UTF_8.name().equalsIgnoreCase(str)) {
            throw new UnsupportedOperationException();
        }
        C11549 c11549 = new C11549(outputStream);
        this.f19391 = c11549;
        c11549.write(f19390, 0, 4);
        this.f19393 = 0;
        this.f19392 = new String[8];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(Writer writer) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void flush() throws IOException {
        this.f19391.flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void startDocument(String str, Boolean bool) throws IOException {
        if (str != null && !StandardCharsets.UTF_8.name().equalsIgnoreCase(str)) {
            throw new UnsupportedOperationException();
        }
        if (bool != null && !bool.booleanValue()) {
            throw new UnsupportedOperationException();
        }
        this.f19391.writeByte(16);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void endDocument() throws IOException {
        this.f19391.writeByte(17);
        flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final int getDepth() {
        return this.f19393;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getName() {
        return this.f19392[this.f19393 - 1];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer startTag(String str, String str2) throws IOException {
        if (str != null && !str.isEmpty()) {
            m16546();
            throw null;
        }
        int i = this.f19393;
        String[] strArr = this.f19392;
        if (i == strArr.length) {
            this.f19392 = (String[]) Arrays.copyOf(strArr, i + (i >> 1));
        }
        String[] strArr2 = this.f19392;
        int i2 = this.f19393;
        this.f19393 = i2 + 1;
        strArr2[i2] = str2;
        this.f19391.writeByte(50);
        this.f19391.m29053(str2);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer endTag(String str, String str2) throws IOException {
        if (str != null && !str.isEmpty()) {
            m16546();
            throw null;
        }
        this.f19393--;
        this.f19391.writeByte(51);
        this.f19391.m29053(str2);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer attribute(String str, String str2, String str3) throws IOException {
        if (str != null && !str.isEmpty()) {
            m16546();
            throw null;
        }
        if (str3 == null) {
            this.f19391.writeByte(31);
            this.f19391.m29053(str2);
            return this;
        }
        this.f19391.writeByte(47);
        this.f19391.m29053(str2);
        this.f19391.writeUTF(str3);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16552(String str, String str2) throws IOException {
        this.f19391.writeByte(63);
        this.f19391.m29053(str);
        this.f19391.m29053(str2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16557(String str, byte[] bArr) throws IOException {
        this.f19391.writeByte(79);
        this.f19391.m29053(str);
        this.f19391.writeShort(bArr.length);
        C11549 c11549 = this.f19391;
        c11549.getClass();
        c11549.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16554(String str, byte[] bArr) throws IOException {
        this.f19391.writeByte(95);
        this.f19391.m29053(str);
        this.f19391.writeShort(bArr.length);
        C11549 c11549 = this.f19391;
        c11549.getClass();
        c11549.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16548(int i, String str) throws IOException {
        this.f19391.writeByte(UMErrorCode.E_UM_BE_CREATE_FAILED);
        this.f19391.m29053(str);
        this.f19391.writeInt(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16555(int i, String str) throws IOException {
        this.f19391.writeByte(127);
        this.f19391.m29053(str);
        this.f19391.writeInt(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16549(long j, String str) throws IOException {
        this.f19391.writeByte(143);
        this.f19391.m29053(str);
        this.f19391.writeLong(j);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16556(long j, String str) throws IOException {
        this.f19391.writeByte(159);
        this.f19391.m29053(str);
        this.f19391.writeLong(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16551(String str, float f) throws IOException {
        this.f19391.writeByte(HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS);
        this.f19391.m29053(str);
        this.f19391.writeFloat(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16550(String str, double d) throws IOException {
        this.f19391.writeByte(191);
        this.f19391.m29053(str);
        this.f19391.writeDouble(d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16553(String str, boolean z) throws IOException {
        if (z) {
            this.f19391.writeByte(207);
            this.f19391.m29053(str);
        } else {
            this.f19391.writeByte(223);
            this.f19391.m29053(str);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(char[] cArr, int i, int i2) throws IOException {
        m16547(4, new String(cArr, i, i2));
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(String str) throws IOException {
        m16547(4, str);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void cdsect(String str) throws IOException {
        m16547(5, str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void entityRef(String str) throws IOException {
        m16547(6, str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void processingInstruction(String str) throws IOException {
        m16547(8, str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void comment(String str) throws IOException {
        m16547(9, str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void docdecl(String str) throws IOException {
        m16547(10, str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void ignorableWhitespace(String str) throws IOException {
        m16547(7, str);
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
    public static void m16546() {
        throw new IllegalArgumentException("Namespaces are not supported");
    }
}
