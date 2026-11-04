package l;

import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟۬۫, reason: contains not printable characters */
/* JADX INFO: compiled from: R5YB */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7911 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f26274;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f26275;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C8614 f26276;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f26277;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15102 f26278;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo21451();

    public AbstractC7911(C8614 c8614, C15102 c15102, ArrayList arrayList, boolean z, String str) {
        this.f26276 = c8614;
        this.f26278 = c15102;
        this.f26277 = arrayList;
        this.f26274 = z;
        this.f26275 = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m21452() {
        C15102 c15102 = this.f26278;
        AbstractC22044 abstractC22044M35193 = C14584.m35193(c15102.m36371(), new String[0]);
        boolean zMo4303 = abstractC22044M35193.mo4303();
        C8614 c8614 = this.f26276;
        if (zMo4303) {
            AbstractC22044 abstractC22044M49858 = abstractC22044M35193.m49858();
            C17359.requireNonNull(abstractC22044M49858);
            if (!abstractC22044M49858.mo4303()) {
                if (!C7756.m21096()) {
                    c8614.m23233().m40400(C21576.m49059(R.string.MT_Protector, c15102.m36371()), false);
                    return;
                }
            }
        } else if (!C7756.m21096()) {
            c8614.m23233().m40400(C21576.m49059(R.string.MT_Protector, c15102.m36371()), false);
            return;
        }
        if (this.f26274) {
            C0938.m3749(new C14622(this), c8614.m23233(), this.f26275);
        } else {
            new C0453(this, null, false).m8197();
        }
    }
}
