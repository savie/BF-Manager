package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E1HX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19367 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC19367 f62423 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC19367 f62424 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC19367 f62427 = null;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC19367 f62425 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC19367 f62426 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f62428 = null;

    /* JADX INFO: renamed from: ֨ */
    public String mo40213() {
        return "";
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo3851(InterfaceC10901 interfaceC10901);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC19367 m44390() {
        return this.f62426;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC19367 m44389() {
        return this.f62425;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC19367 m44383() {
        return this.f62424;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC19367 m44392() {
        return this.f62427;
    }

    /* JADX INFO: renamed from: ۖ */
    public AbstractC19367 mo35319() {
        return this.f62423;
    }

    /* JADX INFO: renamed from: ۨ */
    public void mo35320(AbstractC19367 abstractC19367) {
        this.f62423 = abstractC19367;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m44388(AbstractC19367 abstractC19367) {
        abstractC19367.m44391();
        abstractC19367.mo35320(this);
        AbstractC19367 abstractC19368 = this.f62427;
        if (abstractC19368 != null) {
            abstractC19368.f62426 = abstractC19367;
            abstractC19367.f62425 = abstractC19368;
        } else {
            this.f62424 = abstractC19367;
        }
        this.f62427 = abstractC19367;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44386(C9778 c9778) {
        c9778.m44391();
        c9778.f62423 = this;
        AbstractC19367 abstractC19367 = this.f62424;
        if (abstractC19367 != null) {
            abstractC19367.f62425 = c9778;
            c9778.f62426 = abstractC19367;
            this.f62424 = c9778;
        } else {
            this.f62424 = c9778;
            this.f62427 = c9778;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m44391() {
        AbstractC19367 abstractC19367 = this.f62425;
        if (abstractC19367 != null) {
            abstractC19367.f62426 = this.f62426;
        } else {
            AbstractC19367 abstractC19368 = this.f62423;
            if (abstractC19368 != null) {
                abstractC19368.f62424 = this.f62426;
            }
        }
        AbstractC19367 abstractC19369 = this.f62426;
        if (abstractC19369 != null) {
            abstractC19369.f62425 = abstractC19367;
        } else {
            AbstractC19367 abstractC193610 = this.f62423;
            if (abstractC193610 != null) {
                abstractC193610.f62427 = abstractC19367;
            }
        }
        this.f62423 = null;
        this.f62426 = null;
        this.f62425 = null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44393(AbstractC19367 abstractC19367) {
        abstractC19367.m44391();
        AbstractC19367 abstractC19368 = this.f62426;
        abstractC19367.f62426 = abstractC19368;
        if (abstractC19368 != null) {
            abstractC19368.f62425 = abstractC19367;
        }
        abstractC19367.f62425 = this;
        this.f62426 = abstractC19367;
        AbstractC19367 abstractC19369 = this.f62423;
        abstractC19367.f62423 = abstractC19369;
        if (abstractC19367.f62426 == null) {
            abstractC19369.f62427 = abstractC19367;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44387(C17955 c17955) {
        c17955.m44391();
        AbstractC19367 abstractC19367 = this.f62425;
        c17955.f62425 = abstractC19367;
        if (abstractC19367 != null) {
            abstractC19367.f62426 = c17955;
        }
        c17955.f62426 = this;
        this.f62425 = c17955;
        AbstractC19367 abstractC19368 = this.f62423;
        c17955.f62423 = abstractC19368;
        if (c17955.f62425 == null) {
            abstractC19368.f62424 = c17955;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List m44394() {
        ArrayList arrayList = this.f62428;
        return arrayList != null ? C0561.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44384(List list) {
        if (list.isEmpty()) {
            this.f62428 = null;
        } else {
            this.f62428 = new ArrayList(list);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44385(C0316 c0316) {
        if (this.f62428 == null) {
            this.f62428 = new ArrayList();
        }
        this.f62428.add(c0316);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        return C22697.m50267(sb, mo40213(), l.d);
    }
}
