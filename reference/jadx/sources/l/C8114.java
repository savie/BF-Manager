package l;

import android.net.Uri;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۤ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 274F */
/* JADX INFO: loaded from: classes3.dex */
public final class C8114 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f28429;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21519 f28431;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final RunnableC4263 f28432;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C18441 f28434;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f28436 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashSet f28435 = new HashSet();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashSet f28430 = new HashSet();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f28433 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m21375() {
        this.f28436.clear();
        this.f28435.clear();
        this.f28430.clear();
        this.f28433.clear();
        this.f28431 = null;
        this.f28434 = null;
        this.f28429++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m21376(Uri uri, C16325 c16325) {
        C18441 c18441 = this.f28434;
        if (c16325 != null && c18441 != null) {
            C5741 c5741Mo14543 = c18441.mo14543();
            if (c5741Mo14543 != null && c5741Mo14543.f19533.isEmpty()) {
                Iterator it = c5741Mo14543.f19532.iterator();
                while (it.hasNext()) {
                    if (((C17030) it.next()).f54408.equals(uri)) {
                        if (this.f28433.get(uri) == c16325) {
                            return;
                        }
                        this.f28433.put(uri, c16325);
                        if (this.f28431 != null) {
                            this.f28431 = null;
                            this.f28432.run();
                        }
                        m21373(c18441, c5741Mo14543);
                        this.f28429++;
                        return;
                    }
                }
                return;
            }
            m21374();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m21377(C12257 c12257) {
        Uri uri = c12257.f41015;
        long j = c12257.f41009;
        long j2 = c12257.f41017;
        if (j2 == -1) {
            j2 = -1;
        }
        C18697 c18697 = new C18697(uri, j, j2);
        if (this.f28430.contains(c18697)) {
            return;
        }
        if (this.f28435.contains(c18697)) {
            if (this.f28431 != null) {
                this.f28431 = null;
                this.f28432.run();
            }
            return;
        }
        C17991 c17991 = (C17991) this.f28436.get(c18697);
        C18441 c18441 = this.f28434;
        if (c17991 != null && c18441 != null) {
            C21519 c21519 = new C21519(c17991.f57530, this.f28429, c17991.f57528, c18441.mo14535(), c18697, c17991.f57529);
            C21519 c215110 = this.f28431;
            if (c215110 != null && (!c215110.f69913.equals(c21519.f69913) || this.f28431.f69918 != c21519.f69918)) {
                this.f28432.run();
            }
            this.f28431 = c21519;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m21378(C18441 c18441) {
        this.f28434 = c18441;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized C21519 m21379() {
        return this.f28431;
    }

    public C8114(RunnableC4263 runnableC4263) {
        this.f28432 = runnableC4263;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m21374() {
        HashMap map = this.f28436;
        boolean zIsEmpty = map.isEmpty();
        HashSet hashSet = this.f28430;
        HashSet hashSet2 = this.f28435;
        if (zIsEmpty && hashSet2.isEmpty() && hashSet.isEmpty() && this.f28431 == null) {
            return;
        }
        map.clear();
        hashSet2.clear();
        hashSet.clear();
        this.f28433.clear();
        this.f28431 = null;
        this.f28429++;
        this.f28432.run();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21373(C18441 c18441, C5741 c5741) {
        long j;
        HashMap map = this.f28436;
        map.clear();
        HashSet hashSet = this.f28435;
        hashSet.clear();
        HashSet hashSet2 = this.f28430;
        hashSet2.clear();
        HashMap map2 = this.f28433;
        map2.clear();
        Iterator it = c5741.f19532.iterator();
        while (it.hasNext()) {
            Uri uri = ((C17030) it.next()).f54408;
            C16325 c16325Mo14536 = c18441.mo14536(uri, false);
            if (c16325Mo14536 != null) {
                String str = c16325Mo14536.f36441;
                map2.put(uri, c16325Mo14536);
                for (C15620 c15620 : c16325Mo14536.f52586) {
                    C15620 c15621 = c15620.f63676;
                    if (c15621 != null) {
                        j = -1;
                        Uri uriM50741 = C22923.m50741(str, c15621.f63674);
                        long j2 = c15621.f63682;
                        long j3 = c15621.f63679;
                        hashSet2.add(new C18697(uriM50741, j2, j3 == -1 ? -1L : j3));
                    } else {
                        j = -1;
                    }
                    Uri uriM50742 = C22923.m50741(str, c15620.f63674);
                    long j4 = c15620.f63682;
                    String str2 = str;
                    long j5 = c15620.f63679;
                    C18697 c18697 = new C18697(uriM50742, j4, j5 == j ? j : j5);
                    if (((C17991) C9735.putIfAbsent(map, c18697, new C17991(uri, c16325Mo14536, c15620))) != null) {
                        map.remove(c18697);
                        hashSet.add(c18697);
                    }
                    str = str2;
                    map2 = map2;
                    it = it;
                }
            }
        }
    }
}
