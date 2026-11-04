package l;

/* JADX INFO: renamed from: l.ۗۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21YS */
/* JADX INFO: loaded from: classes2.dex */
public final class C3150 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f10213 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f10214 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f10212 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10289(C22941 c22941) {
        C8002 entry = c22941.getEntry("AndroidManifest.xml");
        if (entry == null || entry.getSize() > 5242880) {
            this.f10213 = false;
            this.f10214 = false;
            return;
        }
        try {
            C14955 c14955M35973 = C14955.m35973(c22941.m51727(entry));
            this.f10213 = C18685.m43477(c14955M35973);
            this.f10214 = C18685.m43478(c14955M35973);
        } catch (Throwable unused) {
            this.f10213 = false;
            this.f10214 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10290(byte[] bArr) {
        try {
            C14955 c14955M35982 = C14955.m35982(bArr);
            this.f10213 = C18685.m43477(c14955M35982);
            this.f10214 = C18685.m43478(c14955M35982);
        } catch (Exception unused) {
            this.f10213 = false;
            this.f10214 = false;
        }
    }
}
