package l;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.function.BooleanSupplier;
import net.sf.sevenzipjbinding.ICryptoGetTextPassword;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ۤ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: BB70 */
/* JADX INFO: loaded from: classes3.dex */
public class C10574 implements ICryptoGetTextPassword {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Iterator f36178;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f36179;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f36180;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f36181;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f36182;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f36183;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public BooleanSupplier f36184 = new C19746();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f36185;

    public C10574(AbstractActivityC12483 abstractActivityC12483) {
        this.f36182 = abstractActivityC12483;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void m26747(String str) {
        this.f36183 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m26746(BooleanSupplier booleanSupplier) {
        this.f36184 = booleanSupplier;
    }

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public boolean m26749() {
        return this.f36180;
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public String m26750() {
        if (TextUtils.isEmpty(this.f36183)) {
            return null;
        }
        return this.f36183;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean mo26748() {
        return this.f36185;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m26745() {
        return this.f36181;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean m26751() {
        return this.f36179;
    }

    @Override // net.sf.sevenzipjbinding.ICryptoGetTextPassword
    public String cryptoGetTextPassword() throws SevenZipException {
        m26743();
        this.f36180 = true;
        if (TextUtils.isEmpty(this.f36183)) {
            if (this.f36178 == null) {
                this.f36178 = C11088.m27974();
            }
            if (this.f36178.hasNext()) {
                this.f36183 = (String) this.f36178.next();
                this.f36181 = true;
                this.f36179 = false;
            } else {
                this.f36181 = false;
                C6004 c6004 = new C6004(this.f36182, new InterfaceC17293() { // from class: l.ۡ᩹ۖ
                    @Override // l.InterfaceC17293
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo1826(String str) {
                        this.f31205.f36183 = str;
                    }
                });
                c6004.m16303(this.f36184);
                boolean zM16304 = c6004.m16304();
                this.f36179 = zM16304;
                this.f36185 = true ^ zM16304;
                m26743();
            }
        } else {
            this.f36181 = false;
            this.f36179 = false;
        }
        m26743();
        return this.f36183;
    }

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    private void m26743() throws SevenZipException {
        if (this.f36185 || this.f36184.getAsBoolean()) {
            this.f36185 = true;
            throw new SevenZipException("Cancel");
        }
    }
}
