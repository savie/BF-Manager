package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ۖܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94PF */
/* JADX INFO: loaded from: classes.dex */
public final class C23994 extends AbstractViewOnClickListenerC8526 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f77638;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f77639;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public List f77640;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53550(C23994 c23994, C6094 c6094, C6094 c6095) {
        c23994.getClass();
        int bindingAdapterPosition = c6094.getBindingAdapterPosition();
        int bindingAdapterPosition2 = c6095.getBindingAdapterPosition();
        C9271 c9271 = c23994.f27860;
        int iM24474 = (bindingAdapterPosition - c9271.m24474(c23994)) - 1;
        int iM24475 = (bindingAdapterPosition2 - c9271.m24474(c23994)) - 1;
        ArrayList arrayList = c23994.f27858;
        C9911.m25734(iM24474, iM24475, arrayList);
        c9271.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        String[] strArr = (String[]) C1170.stream(arrayList).map(new C16534()).toArray(new C17280(0));
        int i = C22015.f71041;
        C5261.m15836(new RunnableC13526(0, strArr), C22015.class, 1000L);
    }

    static {
        AbstractC22044 abstractC22044M49876 = C6382.f21570.m49876("projects");
        f77638 = abstractC22044M49876;
        f77639 = C6382.f21564.m49856().m49876("projects");
        if (abstractC22044M49876.mo4304()) {
            abstractC22044M49876.mo4296();
            abstractC22044M49876.mo4274();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C23994(Main main, C9271 c9271) {
        String strM49088 = C21576.m49088(R.string.MT_Protector);
        super(main, strM49088, strM49088, c9271);
        this.f77640 = Collections.EMPTY_LIST;
        m53551();
        main.m117().m46145(new RunnableC15052(4, this));
        main.getLifecycle().mo23077(new InterfaceC5252() { // from class: l.ܶۖܳ
            @Override // l.InterfaceC5252
            /* JADX INFO: renamed from: ۙ */
            public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
                if (enumC9330 == EnumC9330.ON_RESUME) {
                    this.f51371.m53552();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m53552() {
        if (m53551()) {
            this.f27860.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m53551() {
        boolean z;
        List listM49797 = C22015.m49797(f77638, f77639);
        if (this.f77640.size() != listM49797.size() || !this.f77640.containsAll(listM49797)) {
            this.f77640 = listM49797;
            ArrayList arrayList = this.f27858;
            if (arrayList.isEmpty()) {
                z = true;
            } else {
                arrayList.clear();
                z = false;
            }
            Iterator it = listM49797.iterator();
            while (it.hasNext()) {
                arrayList.add(new C12059(this, this.f22654, (AbstractC22044) it.next()));
            }
            if (!z || !arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractViewOnClickListenerC8526
    /* JADX INFO: renamed from: ۙ */
    public final void mo3565(AbstractViewOnLongClickListenerC5544 abstractViewOnLongClickListenerC5544, int i) {
        C6094 c6094 = (C6094) abstractViewOnLongClickListenerC5544;
        C12059 c12059 = (C12059) this.f27858.get(i);
        c6094.f20822 = c12059;
        c6094.f19266.setText(c12059.f38843);
        c6094.f19262.setText(c12059.f38842);
        c6094.f19265.m9864(c12059.f38844);
        c6094.itemView.setOnClickListener(c12059);
        this.f27860.m24477((AbstractViewOnLongClickListenerC5544) c6094);
    }
}
