package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.᩹ܽ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes.dex */
public final class C23684 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f76793;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f76794;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f76795;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC16970 f76796;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f76797;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f76798;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f76799;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f76800;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12495 f76801;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1626 f76802;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f76803;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f76804;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C23684(C12495 c12495, C23255 c23255, Spinner spinner, C23255 c23256, CheckBox checkBox, Spinner spinner2, CheckBox checkBox2, Main main, TextView textView, TextView textView2, C1626 c1626, TextView textView3, RunnableC16970 runnableC16970) {
        this.f76801 = c12495;
        this.f76797 = c23255;
        this.f76800 = spinner;
        this.f76804 = c23256;
        this.f76795 = checkBox;
        this.f76794 = spinner2;
        this.f76798 = checkBox2;
        this.f76803 = textView;
        this.f76793 = textView2;
        this.f76802 = c1626;
        this.f76799 = textView3;
        this.f76796 = runnableC16970;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C12495 c12495 = this.f76801;
        C23255 c23255 = this.f76797;
        Spinner spinner = this.f76800;
        C23255 c23256 = this.f76804;
        CheckBox checkBox = this.f76795;
        Spinner spinner2 = this.f76794;
        CheckBox checkBox2 = this.f76798;
        C4994.m15215(c12495, c23255, spinner, c23256, checkBox, spinner2, checkBox2);
        c12495.f40122 = i;
        C4994.m15220(c12495, this.f76803, c23255, spinner, this.f76793, c23256, this.f76802, checkBox, this.f76799, spinner2, checkBox2);
        this.f76796.run();
    }
}
