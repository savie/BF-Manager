package l;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.function.BooleanSupplier;
import net.sf.sevenzipjbinding.ICryptoGetTextPassword;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.᩵ܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: BB70 */
/* JADX INFO: loaded from: classes5.dex */
public class C20642 implements ICryptoGetTextPassword {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f66198;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f66199;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f66200;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f66201;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f66202;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Iterator f66203;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public BooleanSupplier f66204 = new C23626();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f66205;

    public C20642(AbstractActivityC17204 abstractActivityC17204) {
        this.f66202 = abstractActivityC17204;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public void m47258(String str) {
        this.f66198 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m47256(BooleanSupplier booleanSupplier) {
        this.f66204 = booleanSupplier;
    }

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public boolean m47260() {
        return this.f66199;
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public String m47255() {
        if (TextUtils.isEmpty(this.f66198)) {
            return null;
        }
        return this.f66198;
    }

    /* JADX INFO: renamed from: ܰۙ */
    public boolean mo4531() {
        return this.f66205;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean m47257() {
        return this.f66200;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean m47259() {
        return this.f66201;
    }

    @Override // net.sf.sevenzipjbinding.ICryptoGetTextPassword
    public String cryptoGetTextPassword() throws SevenZipException {
        m47254();
        this.f66199 = true;
        if (TextUtils.isEmpty(this.f66198)) {
            if (this.f66203 == null) {
                this.f66203 = C21054.m48118();
            }
            if (this.f66203.hasNext()) {
                this.f66198 = (String) this.f66203.next();
                this.f66200 = true;
                this.f66201 = false;
            } else {
                this.f66200 = false;
                C10039 c10039 = new C10039(this.f66202, new InterfaceC18990() { // from class: l.ۗܳ᩸
                    @Override // l.InterfaceC18990
                    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
                    public final void mo11476(String str) {
                        this.f12042.f66198 = str;
                    }
                });
                c10039.m25890(this.f66204);
                boolean zM25891 = c10039.m25891();
                this.f66201 = zM25891;
                this.f66205 = true ^ zM25891;
                m47254();
            }
        } else {
            this.f66200 = false;
            this.f66201 = false;
        }
        m47254();
        return this.f66198;
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    private void m47254() throws SevenZipException {
        if (this.f66205 || this.f66204.getAsBoolean()) {
            this.f66205 = true;
            throw new SevenZipException("Cancel");
        }
    }
}
