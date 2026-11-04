package l;

import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: l.᩸ܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X55S */
/* JADX INFO: loaded from: classes.dex */
public final class C22913 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74463;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f74464;

    public String toString() {
        switch (this.f74463) {
            case 1:
                return m51662() + " " + ((C17489) this.f74464).m40994().m38125() + ' ' + m51667();
            default:
                return super.toString();
        }
    }

    public C22913() {
        this.f74463 = 0;
        this.f74464 = new ByteArrayOutputStream(1024);
    }

    public C22913(C17489 c17489) {
        this.f74463 = 1;
        c17489.mo17866(EnumC1763.HIDDEN);
        this.f74464 = c17489;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC15997 m51668() {
        return ((C17489) this.f74464).m40994();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] m51664() {
        return ((ByteArrayOutputStream) this.f74464).toByteArray();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC16481 m51662() {
        return ((C17489) this.f74464).mo44035(0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC16481 m51667() {
        return ((C17489) this.f74464).mo44035(1);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C17489 m51663() {
        return (C17489) this.f74464;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void m51666() {
        ((C17489) this.f74464).m40993();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m51665() {
        ((C17489) this.f74464).normalize();
    }
}
