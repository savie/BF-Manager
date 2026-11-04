package l;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I69B */
/* JADX INFO: loaded from: classes5.dex */
public class C18667 extends C21806 {

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public Spinner f60702;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public final AdapterView.OnItemSelectedListener f60703;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayAdapter f60704;

    public C18667(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18667(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f60703 = new C21651(this);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f60704 = arrayAdapter;
        arrayAdapter.clear();
        if (m49458() != null) {
            for (CharSequence charSequence : m49458()) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // l.AbstractC14937, l.C3906
    /* JADX INFO: renamed from: ֨ */
    public final void mo12556() {
        this.f60702.performClick();
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۟ */
    public final void mo7306() {
        super.mo7306();
        ArrayAdapter arrayAdapter = this.f60704;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final void mo12570(C1228 c1228) {
        int length;
        Spinner spinner = (Spinner) c1228.itemView.findViewById(R.id.spinner);
        this.f60702 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f60704);
        this.f60702.setOnItemSelectedListener(this.f60703);
        Spinner spinner2 = this.f60702;
        String value = getValue();
        CharSequence[] charSequenceArrM49455 = m49455();
        if (value != null && charSequenceArrM49455 != null) {
            length = charSequenceArrM49455.length;
            do {
                length--;
                if (length < 0) {
                    length = -1;
                    break;
                }
            } while (!TextUtils.equals(charSequenceArrM49455[length].toString(), value));
        } else {
            length = -1;
            break;
        }
        spinner2.setSelection(length);
        super.mo12570(c1228);
    }
}
