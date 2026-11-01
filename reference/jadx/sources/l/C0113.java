package l;

import android.text.TextUtils;
import android.util.Base64;
import java.io.Serializable;

/* JADX INFO: renamed from: l.֡ۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes2.dex */
public final class C0113 implements Serializable {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f1088 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f1085 = true;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f1090 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f1096 = false;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f1091 = 10;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f1095 = 2;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f1094 = 10;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f1097 = 1000;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f1092 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f1086 = "\\n";

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f1089 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f1087 = true;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f1093 = "";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m1154() {
        InterfaceC17314 interfaceC17314Edit = ApplicationC0716.f2992.edit();
        C11018 c11018 = new C11018();
        boolean z = this.f1088 == 0;
        this.f1085 = z;
        ?? r2 = z;
        if (this.f1090) {
            r2 = (z ? 1 : 0) | 2;
        }
        int i = r2;
        if (this.f1096) {
            i = (r2 == true ? 1 : 0) | 4;
        }
        c11018.writeByte(i);
        c11018.writeInt(this.f1091);
        c11018.writeInt(this.f1095);
        c11018.writeInt(this.f1094);
        c11018.writeInt(this.f1088);
        c11018.writeInt(this.f1097);
        c11018.m27784(this.f1092);
        c11018.m27782(this.f1086);
        int iM3595 = C0901.m3595(this.f1089);
        this.f1089 = iM3595;
        c11018.writeInt(iM3595);
        c11018.m27784(this.f1087);
        CharSequence charSequence = this.f1093;
        if (charSequence == null) {
            charSequence = "";
        }
        c11018.m27782(charSequence);
        interfaceC17314Edit.putString("smfa", Base64.encodeToString(c11018.m27773(), 2)).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m1155() {
        String string = ApplicationC0716.f2992.getString("smfa", null);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            C17367 c17367 = new C17367(Base64.decode(string, 2));
            byte b = c17367.readByte();
            this.f1085 = (b & 1) != 0;
            this.f1090 = (b & 2) != 0;
            this.f1096 = (b & 4) != 0;
            this.f1091 = c17367.readInt();
            this.f1095 = c17367.readInt();
            this.f1094 = c17367.readInt();
            this.f1088 = !this.f1085 ? 1 : 0;
            int i = c17367.readInt();
            int i2 = c17367.readInt();
            boolean zM40461 = c17367.m40461();
            String strM40442 = c17367.m40442();
            int iM3595 = C0901.m3595(c17367.readInt());
            boolean zM40462 = c17367.m40461();
            String strM40443 = c17367.m40442();
            if (i >= 0 && i <= 3) {
                this.f1088 = i;
                this.f1085 = i == 0;
            }
            this.f1097 = i2;
            this.f1092 = zM40461;
            this.f1086 = strM40442;
            this.f1089 = iM3595;
            this.f1087 = zM40462;
            this.f1093 = strM40443;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m1153() {
        int i = this.f1088;
        return i == 2 || i == 3;
    }
}
