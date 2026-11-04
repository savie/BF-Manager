package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C15264 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C5570 f49908;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f49905 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f49907 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f49906 = new ArrayList();

    public C15264(C5570 c5570) {
        this.f49908 = c5570;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36617() {
        while (!this.f49907.isEmpty() && ((C21978) this.f49907.get(0)).f70920.isEmpty()) {
            this.f49907.remove(0);
        }
        while (!this.f49907.isEmpty() && ((C21978) j$$ExternalSyntheticOutline0.m(this.f49907, 1)).f70920.isEmpty()) {
            C2764.m9138(this.f49907, 1);
        }
        if (this.f49907.size() == 1 && ((C21978) this.f49907.get(0)).f70920.equals("nop")) {
            this.f49907.clear();
            return;
        }
        if (this.f49907.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f49905;
        arrayList.add(new C19740(this.f49908, arrayList.size(), this.f49907));
        this.f49907 = new ArrayList();
    }
}
