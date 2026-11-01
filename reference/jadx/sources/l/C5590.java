package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 81CV */
/* JADX INFO: loaded from: classes3.dex */
public class C5590 implements InterfaceC14058 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f19193;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC7707 f19194;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f19196;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC7707 f19198 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f19190 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f19197 = false;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public EnumC2767 f19192 = EnumC2767.UNKNOWN;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f19191 = 1;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C22524 f19188 = null;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f19187 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f19195 = new ArrayList();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ArrayList f19189 = new ArrayList();

    public C5590(AbstractC7707 abstractC7707) {
        this.f19194 = abstractC7707;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19194.f25504.m46643());
        sb.append(":");
        sb.append(this.f19192);
        sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
        sb.append(this.f19187 ? Integer.valueOf(this.f19196) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f19189.size());
        sb.append(":d=");
        sb.append(this.f19195.size());
        sb.append(">");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo15463(int i) {
        if (this.f19187) {
            return;
        }
        this.f19187 = true;
        this.f19196 = i;
        for (InterfaceC14058 interfaceC14058 : this.f19195) {
            interfaceC14058.mo11822(interfaceC14058);
        }
    }

    @Override // l.InterfaceC14058
    /* JADX INFO: renamed from: ۙ */
    public final void mo11822(InterfaceC14058 interfaceC14058) {
        ArrayList<C5590> arrayList = this.f19189;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C5590) it.next()).f19187) {
                return;
            }
        }
        this.f19197 = true;
        AbstractC7707 abstractC7707 = this.f19198;
        if (abstractC7707 != null) {
            abstractC7707.mo11822(this);
        }
        if (this.f19190) {
            this.f19194.mo11822(this);
            return;
        }
        C5590 c5590 = null;
        int i = 0;
        for (C5590 c5591 : arrayList) {
            if (!(c5591 instanceof C22524)) {
                i++;
                c5590 = c5591;
            }
        }
        if (c5590 != null && i == 1 && c5590.f19187) {
            C22524 c22524 = this.f19188;
            if (c22524 != null) {
                if (!c22524.f19187) {
                    return;
                } else {
                    this.f19193 = this.f19191 * c22524.f19196;
                }
            }
            mo15463(c5590.f19196 + this.f19193);
        }
        AbstractC7707 abstractC7708 = this.f19198;
        if (abstractC7708 != null) {
            abstractC7708.mo11822(this);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15464(AbstractC7707 abstractC7707) {
        this.f19195.add(abstractC7707);
        if (this.f19187) {
            abstractC7707.mo11822(abstractC7707);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15462() {
        this.f19189.clear();
        this.f19195.clear();
        this.f19187 = false;
        this.f19196 = 0;
        this.f19197 = false;
        this.f19190 = false;
    }
}
