package l;

import android.text.TextUtils;
import android.util.Base64;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۨܽ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public final class C12495 implements Serializable {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f40122 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f40125 = true;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f40116 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f40127 = false;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f40119 = 10;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f40126 = 2;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f40115 = 10;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f40121 = 1000;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f40117 = true;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f40120 = "\\n";

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f40118 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f40123 = true;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f40124 = "";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m31036() {
        InterfaceC18752 interfaceC18752Edit = ApplicationC17729.f58258.edit();
        C6178 c6178 = new C6178();
        boolean z = this.f40122 == 0;
        this.f40125 = z;
        ?? r2 = z;
        if (this.f40116) {
            r2 = (z ? 1 : 0) | 2;
        }
        int i = r2;
        if (this.f40127) {
            i = (r2 == true ? 1 : 0) | 4;
        }
        c6178.writeByte(i);
        c6178.writeInt(this.f40119);
        c6178.writeInt(this.f40126);
        c6178.writeInt(this.f40115);
        c6178.writeInt(this.f40122);
        c6178.writeInt(this.f40121);
        c6178.m17789(this.f40117);
        c6178.m17786(this.f40120);
        int iM15219 = C4994.m15219(this.f40118);
        this.f40118 = iM15219;
        c6178.writeInt(iM15219);
        c6178.m17789(this.f40123);
        CharSequence charSequence = this.f40124;
        if (charSequence == null) {
            charSequence = "";
        }
        c6178.m17786(charSequence);
        interfaceC18752Edit.putString("smfa", Base64.encodeToString(c6178.m17796(), 2)).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31035() {
        String string = ApplicationC17729.f58258.getString("smfa", null);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            C20348 c20348 = new C20348(Base64.decode(string, 2));
            byte b = c20348.readByte();
            this.f40125 = (b & 1) != 0;
            this.f40116 = (b & 2) != 0;
            this.f40127 = (b & 4) != 0;
            this.f40119 = c20348.readInt();
            this.f40126 = c20348.readInt();
            this.f40115 = c20348.readInt();
            this.f40122 = !this.f40125 ? 1 : 0;
            int i = c20348.readInt();
            int i2 = c20348.readInt();
            boolean zM46753 = c20348.m46753();
            String strM46756 = c20348.m46756();
            int iM15219 = C4994.m15219(c20348.readInt());
            boolean zM46754 = c20348.m46753();
            String strM46757 = c20348.m46756();
            if (i >= 0 && i <= 3) {
                this.f40122 = i;
                this.f40125 = i == 0;
            }
            this.f40121 = i2;
            this.f40117 = zM46753;
            this.f40120 = strM46756;
            this.f40118 = iM15219;
            this.f40123 = zM46754;
            this.f40124 = strM46757;
        } catch (Exception unused) {
        }
    }
}
