package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 94PF */
/* JADX INFO: loaded from: classes5.dex */
public final class C19575 extends AbstractViewOnClickListenerC6314 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f62891;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f62892;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f62893;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44679(C19575 c19575, C8286 c8286, C8286 c8287) {
        c19575.getClass();
        int bindingAdapterPosition = c8286.getBindingAdapterPosition();
        int bindingAdapterPosition2 = c8287.getBindingAdapterPosition();
        C12665 c12665 = c19575.f21343;
        int iM31486 = (bindingAdapterPosition - c12665.m31486(c19575)) - 1;
        int iM31487 = (bindingAdapterPosition2 - c12665.m31486(c19575)) - 1;
        ArrayList arrayList = c19575.f21338;
        C23520.m51798(iM31486, iM31487, arrayList);
        c12665.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        String[] strArr = (String[]) C9030.stream(arrayList).map(new C13225()).toArray(new C4051());
        int i = C15556.f50609;
        C4716.m13051(new RunnableC22797(2, strArr), C15556.class, 1000L);
    }

    static {
        AbstractC20745 abstractC20745M46690 = C11904.f39935.m46690("projects");
        f62891 = abstractC20745M46690;
        f62892 = C11904.f39940.m46711().m46690("projects");
        if (abstractC20745M46690.mo33971()) {
            abstractC20745M46690.mo24647();
            abstractC20745M46690.mo33987();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19575(Main main, C12665 c12665) {
        String strM39288 = C16737.m39288(R.string.MT_Protector);
        super(main, strM39288, strM39288, c12665);
        this.f62893 = Collections.EMPTY_LIST;
        m44680();
        main.m125().m18627(new RunnableC19814(2, this));
        main.getLifecycle().mo9171(new InterfaceC5657() { // from class: l.ۜܺ᩹
            @Override // l.InterfaceC5657
            /* JADX INFO: renamed from: ۙ */
            public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
                if (enumC1651 == EnumC1651.ON_RESUME) {
                    this.f23162.m44681();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m44681() {
        if (m44680()) {
            this.f21343.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private boolean m44680() {
        boolean z;
        List listM37194 = C15556.m37194(f62891, f62892);
        if (this.f62893.size() != listM37194.size() || !this.f62893.containsAll(listM37194)) {
            this.f62893 = listM37194;
            ArrayList arrayList = this.f21338;
            if (arrayList.isEmpty()) {
                z = true;
            } else {
                arrayList.clear();
                z = false;
            }
            Iterator it = listM37194.iterator();
            while (it.hasNext()) {
                arrayList.add(new C18869(this, this.f47137, (AbstractC20745) it.next()));
            }
            if (!z || !arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractViewOnClickListenerC6314
    /* JADX INFO: renamed from: ۙ */
    public final void mo15483(AbstractViewOnLongClickListenerC22543 abstractViewOnLongClickListenerC22543, int i) {
        C8286 c8286 = (C8286) abstractViewOnLongClickListenerC22543;
        C18869 c18869 = (C18869) this.f21338.get(i);
        c8286.f28778 = c18869;
        c8286.f73517.setText(c18869.f61102);
        c8286.f73514.setText(c18869.f61103);
        c8286.f73512.m27921(c18869.f61101);
        c8286.itemView.setOnClickListener(c18869);
        this.f21343.m31492((AbstractViewOnLongClickListenerC22543) c8286);
    }
}
