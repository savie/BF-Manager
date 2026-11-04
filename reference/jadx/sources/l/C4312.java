package l;

import android.widget.CheckBox;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.ۘܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4312 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15636;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15637;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15638;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15639;

    public /* synthetic */ C4312(Object obj, Object obj2, Object obj3, int i) {
        this.f15637 = i;
        this.f15639 = obj;
        this.f15638 = obj2;
        this.f15636 = obj3;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f15637) {
            case 0:
                ((DialogInterfaceC8327) this.f15639).m22436().setEnabled(((CheckBox) this.f15638).isChecked() || ((CheckBox) this.f15636).isChecked());
                break;
            default:
                C11223.m28282((C11223) this.f15639, (String) this.f15638, (String) this.f15636, z);
                break;
        }
    }
}
