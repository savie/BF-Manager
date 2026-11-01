package l;

import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9R8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7232 extends ArrayList {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final byte[] f24086 = new byte[8];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f24087;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f24088;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f24089;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f24090;

    public C7232(String str) {
        this.f24088 = str;
    }

    public C7232(AbstractC20745 abstractC20745) throws IOException {
        this.f24090 = abstractC20745;
        m19268();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19263(AbstractC20745 abstractC20745) {
        if (this.f24090 != null) {
            throw new IllegalStateException();
        }
        this.f24090 = abstractC20745;
        m19259(false);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m19261() {
        m19259(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19259(boolean z) {
        C13638.requireNonNull(this.f24090);
        C11018 c11018 = new C11018();
        c11018.m27784(z);
        c11018.m27786(this.f24088);
        c11018.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            C20638 c20638 = (C20638) it.next();
            c11018.writeInt(c20638.f67202);
            c11018.mo24508(c20638.f67203);
            c11018.m27782((CharSequence) c20638.f67205);
            c11018.m27792(c20638.f67201);
            c11018.m27782((CharSequence) c20638.f67204);
        }
        this.f24090.m46703(c11018.m27798());
        this.f24087 = this.f24090.mo33991();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m19268() throws IOException {
        C13638.requireNonNull(this.f24090);
        C17367 c17367M40441 = C17367.m40441(this.f24090.m46727());
        clear();
        this.f24089 = c17367M40441.m40461();
        String strM40458 = c17367M40441.m40458();
        String str = this.f24088;
        if (str == null) {
            this.f24088 = strM40458;
        } else if (!str.equals(strM40458)) {
            throw new IOException();
        }
        int i = c17367M40441.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            C20638 c20638 = new C20638();
            c20638.f67202 = c17367M40441.readInt();
            c20638.f67203 = c17367M40441.m40462();
            c20638.f67205 = c17367M40441.m40442();
            c20638.f67201 = c17367M40441.m40457();
            c20638.f67204 = c17367M40441.m40442();
            add(c20638);
        }
        this.f24087 = this.f24090.mo33991();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m19266() throws IOException {
        long j = this.f24087;
        AbstractC20745 abstractC20745 = this.f24090;
        C13638.requireNonNull(abstractC20745);
        if (j != abstractC20745.mo33991()) {
            System.out.println("File changed: " + this.f24090.mo33986());
            m19268();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19262(MessageDigest messageDigest) {
        byte[] bArr = f24086;
        synchronized (bArr) {
            C15157.m36340(this.f24087, 0, bArr);
            messageDigest.update(bArr);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m19264() {
        return this.f24089;
    }

    /* JADX INFO: renamed from: ᩷ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m19267() {
        AbstractC20745 abstractC20745 = this.f24090;
        C13638.requireNonNull(abstractC20745);
        return abstractC20745;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m19260() {
        return this.f24088;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m19265() {
        if (this.f24088.equals("")) {
            return "[DEFAULT]";
        }
        String str = this.f24088;
        return str.charAt(0) == '-' ? str.substring(1) : str;
    }
}
