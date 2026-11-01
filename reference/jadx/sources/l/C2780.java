package l;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖ᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: I69B */
/* JADX INFO: loaded from: classes3.dex */
public class C2780 extends C8426 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public Spinner f10608;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public final ArrayAdapter f10609;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public final AdapterView.OnItemSelectedListener f10610;

    public C2780(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2780(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f10610 = new C11954(this);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f10609 = arrayAdapter;
        arrayAdapter.clear();
        if (m22074() != null) {
            for (CharSequence charSequence : m22074()) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // l.AbstractC14071, l.C4751
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void mo8454() {
        this.f10608.performClick();
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo8453() {
        super.mo8453();
        ArrayAdapter arrayAdapter = this.f10609;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8452(C4170 c4170) {
        int length;
        Spinner spinner = (Spinner) c4170.itemView.findViewById(R.id.spinner);
        this.f10608 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f10609);
        this.f10608.setOnItemSelectedListener(this.f10610);
        Spinner spinner2 = this.f10608;
        String value = getValue();
        CharSequence[] charSequenceArrM22075 = m22075();
        if (value != null && charSequenceArrM22075 != null) {
            length = charSequenceArrM22075.length;
            do {
                length--;
                if (length < 0) {
                    length = -1;
                    break;
                }
            } while (!TextUtils.equals(charSequenceArrM22075[length].toString(), value));
        } else {
            length = -1;
            break;
        }
        spinner2.setSelection(length);
        super.mo8452(c4170);
    }
}
