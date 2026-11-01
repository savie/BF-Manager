package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻۟, reason: contains not printable characters */
/* JADX INFO: compiled from: P1KQ */
/* JADX INFO: loaded from: classes.dex */
public class C23542 extends C20719 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f76249 = new ArrayList();

    @Override // l.C20719
    /* JADX INFO: renamed from: ֫ */
    public void mo37523() {
        this.f76249.clear();
        super.mo37523();
    }

    /* JADX INFO: renamed from: ᩹ۙ */
    public void mo37541() {
        ArrayList arrayList = this.f76249;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C20719 c20719 = (C20719) this.f76249.get(i);
            if (c20719 instanceof C23542) {
                ((C23542) c20719).mo37541();
            }
        }
    }

    @Override // l.C20719
    /* JADX INFO: renamed from: ۙ */
    public final void mo46593(C11547 c11547) {
        super.mo46593(c11547);
        int size = this.f76249.size();
        for (int i = 0; i < size; i++) {
            ((C20719) this.f76249.get(i)).mo46593(c11547);
        }
    }
}
