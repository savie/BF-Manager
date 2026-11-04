package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1HX */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4534 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC4534 f16128 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC4534 f16123 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC4534 f16127 = null;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AbstractC4534 f16126 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC4534 f16124 = null;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f16125 = null;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo2667(InterfaceC17212 interfaceC17212);

    /* JADX INFO: renamed from: ۫ */
    public String mo4900() {
        return "";
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC4534 m14261() {
        return this.f16124;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC4534 m14264() {
        return this.f16126;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC4534 m14254() {
        return this.f16123;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC4534 m14265() {
        return this.f16127;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC4534 mo14267() {
        return this.f16128;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void mo14262(AbstractC4534 abstractC4534) {
        this.f16128 = abstractC4534;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m14256(AbstractC4534 abstractC4534) {
        abstractC4534.m14260();
        abstractC4534.mo14262(this);
        AbstractC4534 abstractC4535 = this.f16127;
        if (abstractC4535 != null) {
            abstractC4535.f16124 = abstractC4534;
            abstractC4534.f16126 = abstractC4535;
        } else {
            this.f16123 = abstractC4534;
        }
        this.f16127 = abstractC4534;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14258(C6441 c6441) {
        c6441.m14260();
        c6441.f16128 = this;
        AbstractC4534 abstractC4534 = this.f16123;
        if (abstractC4534 != null) {
            abstractC4534.f16126 = c6441;
            c6441.f16124 = abstractC4534;
            this.f16123 = c6441;
        } else {
            this.f16123 = c6441;
            this.f16127 = c6441;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m14260() {
        AbstractC4534 abstractC4534 = this.f16126;
        if (abstractC4534 != null) {
            abstractC4534.f16124 = this.f16124;
        } else {
            AbstractC4534 abstractC4535 = this.f16128;
            if (abstractC4535 != null) {
                abstractC4535.f16123 = this.f16124;
            }
        }
        AbstractC4534 abstractC4536 = this.f16124;
        if (abstractC4536 != null) {
            abstractC4536.f16126 = abstractC4534;
        } else {
            AbstractC4534 abstractC4537 = this.f16128;
            if (abstractC4537 != null) {
                abstractC4537.f16127 = abstractC4534;
            }
        }
        this.f16128 = null;
        this.f16124 = null;
        this.f16126 = null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m14266(AbstractC4534 abstractC4534) {
        abstractC4534.m14260();
        AbstractC4534 abstractC4535 = this.f16124;
        abstractC4534.f16124 = abstractC4535;
        if (abstractC4535 != null) {
            abstractC4535.f16126 = abstractC4534;
        }
        abstractC4534.f16126 = this;
        this.f16124 = abstractC4534;
        AbstractC4534 abstractC4536 = this.f16128;
        abstractC4534.f16128 = abstractC4536;
        if (abstractC4534.f16124 == null) {
            abstractC4536.f16127 = abstractC4534;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14259(C8787 c8787) {
        c8787.m14260();
        AbstractC4534 abstractC4534 = this.f16126;
        c8787.f16126 = abstractC4534;
        if (abstractC4534 != null) {
            abstractC4534.f16124 = c8787;
        }
        c8787.f16124 = this;
        this.f16126 = c8787;
        AbstractC4534 abstractC4535 = this.f16128;
        c8787.f16128 = abstractC4535;
        if (c8787.f16126 == null) {
            abstractC4535.f16123 = c8787;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m14263() {
        ArrayList arrayList = this.f16125;
        return arrayList != null ? C4681.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14255(List list) {
        if (list.isEmpty()) {
            this.f16125 = null;
        } else {
            this.f16125 = new ArrayList(list);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14257(C5280 c5280) {
        if (this.f16125 == null) {
            this.f16125 = new ArrayList();
        }
        this.f16125.add(c5280);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        return C8947.m23910(sb, mo4900(), l.d);
    }
}
