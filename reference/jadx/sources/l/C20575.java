package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.᩷ۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public final class C20575 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f67036;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f67037;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f67038;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC8581 f67039;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f67040;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10948 f67041;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f67042;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0113 f67043;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f67044;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f67045;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f67046;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f67047;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C20575(C0113 c0113, C10948 c10948, Spinner spinner, EditText editText, CheckBox checkBox, Spinner spinner2, CheckBox checkBox2, Main main, TextView textView, TextView textView2, View view, TextView textView3, RunnableC8581 runnableC8581) {
        this.f67043 = c0113;
        this.f67041 = c10948;
        this.f67038 = spinner;
        this.f67036 = editText;
        this.f67042 = checkBox;
        this.f67040 = spinner2;
        this.f67037 = checkBox2;
        this.f67045 = textView;
        this.f67044 = textView2;
        this.f67046 = view;
        this.f67047 = textView3;
        this.f67039 = runnableC8581;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C0113 c0113 = this.f67043;
        C10948 c10948 = this.f67041;
        Spinner spinner = this.f67038;
        EditText editText = this.f67036;
        CheckBox checkBox = this.f67042;
        Spinner spinner2 = this.f67040;
        CheckBox checkBox2 = this.f67037;
        C0901.m3592(c0113, c10948, spinner, editText, checkBox, spinner2, checkBox2);
        c0113.f1088 = i;
        C0901.m3596(c0113, this.f67045, c10948, spinner, this.f67044, editText, this.f67046, checkBox, this.f67047, spinner2, checkBox2);
        this.f67039.run();
    }
}
