package l;

import java.io.IOException;
import java.util.TimerTask;

/* JADX INFO: renamed from: l.ܿۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V9VI */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18053 extends TimerTask {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14168 f59113;

    /* JADX INFO: renamed from: ᩷ */
    public abstract String mo1348();

    public AbstractC18053(C14168 c14168) {
        this.f59113 = c14168;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14168 m42076() {
        return this.f59113;
    }

    public String toString() {
        return mo1348();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1271 m42075(C1271 c1271, C23120 c23120) throws IOException {
        try {
            c1271.m4641(c23120);
            return c1271;
        } catch (IOException unused) {
            int iM44427 = c1271.m44427();
            boolean zM44423 = c1271.m44423();
            int iM4643 = c1271.m4643();
            int iM44436 = c1271.m44436();
            c1271.m44425(iM44427 | 512);
            c1271.m44435(iM44436);
            this.f59113.m34422(c1271);
            C1271 c1272 = new C1271(iM44427, iM4643, zM44423);
            c1272.m4641(c23120);
            return c1272;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1271 m42072(C1271 c1271, C0525 c0525, AbstractC17152 abstractC17152) throws IOException {
        try {
            c1271.m4638(c0525, abstractC17152);
            return c1271;
        } catch (IOException unused) {
            int iM44427 = c1271.m44427();
            boolean zM44423 = c1271.m44423();
            int iM4643 = c1271.m4643();
            int iM44436 = c1271.m44436();
            c1271.m44425(iM44427 | 512);
            c1271.m44435(iM44436);
            this.f59113.m34422(c1271);
            C1271 c1272 = new C1271(iM44427, iM4643, zM44423);
            c1272.m4638(c0525, abstractC17152);
            return c1272;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1271 m42074(C1271 c1271, AbstractC17152 abstractC17152, long j) throws IOException {
        try {
            c1271.m4640(abstractC17152, j);
            return c1271;
        } catch (IOException unused) {
            int iM44427 = c1271.m44427();
            boolean zM44423 = c1271.m44423();
            int iM4643 = c1271.m4643();
            int iM44436 = c1271.m44436();
            c1271.m44425(iM44427 | 512);
            c1271.m44435(iM44436);
            this.f59113.m34422(c1271);
            C1271 c1272 = new C1271(iM44427, iM4643, zM44423);
            c1272.m4640(abstractC17152, j);
            return c1272;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1271 m42073(C1271 c1271, AbstractC17152 abstractC17152) throws IOException {
        try {
            c1271.m4639(abstractC17152);
            return c1271;
        } catch (IOException unused) {
            int iM44427 = c1271.m44427();
            boolean zM44423 = c1271.m44423();
            int iM4643 = c1271.m4643();
            int iM44436 = c1271.m44436();
            c1271.m44425(iM44427 | 512);
            c1271.m44435(iM44436);
            this.f59113.m34422(c1271);
            C1271 c1272 = new C1271(iM44427, iM4643, zM44423);
            c1272.m4639(abstractC17152);
            return c1272;
        }
    }
}
