package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠ᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: U7J7 */
/* JADX INFO: loaded from: classes4.dex */
public class C8330 extends C15760 implements InterfaceC5657 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C21735 f28858;

    public C8330(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setKeyListener(null);
    }

    public C8330(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setKeyListener(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21753(C21735 c21735) {
        this.f28858 = c21735;
        if (c21735 == null) {
            setText((CharSequence) null);
        } else {
            setText(c21735.f40386);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21735 m21752() {
        return this.f28858;
    }

    @Override // android.widget.AutoCompleteTextView
    public final CharSequence convertSelectionToString(Object obj) {
        return (CharSequence) obj;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
        if (charSequence instanceof C18207) {
            super.replaceText(charSequence);
            this.f28858 = ((C18207) charSequence).f58153;
        } else if (charSequence instanceof C18913) {
            super.replaceText("");
            this.f28858 = null;
        } else {
            getContext().startActivity(new Intent(getContext(), (Class<?>) ActivityC0567.class));
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        List listM15768 = C5717.m15768();
        ArrayList arrayList = new ArrayList(listM15768.size() + 2);
        C18913 c18913 = new C18913(C16737.m39288(R.string.MT_Protector));
        c18913.setSpan(new ForegroundColorSpan(C20368.f65988), 0, c18913.length(), 17);
        arrayList.add(c18913);
        Iterator it = listM15768.iterator();
        while (it.hasNext()) {
            arrayList.add(new C18207((C21735) it.next()));
        }
        SpannableString spannableString = new SpannableString(C16737.m39288(R.string.MT_Protector));
        spannableString.setSpan(new ForegroundColorSpan(C20368.f65970), 0, spannableString.length(), 17);
        arrayList.add(spannableString);
        setAdapter(new C0733(getContext(), arrayList));
        super.showDropDown();
    }

    @Override // l.InterfaceC5657
    /* JADX INFO: renamed from: ۙ */
    public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
        C21735 c21735;
        if (enumC1651 != EnumC1651.ON_RESUME || (c21735 = this.f28858) == null) {
            return;
        }
        m21753(C5717.m15757(c21735.f40385));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        m21751().getLifecycle().mo9171(this);
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (isInEditMode()) {
            return;
        }
        m21751().getLifecycle().mo9172(this);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private InterfaceC1423 m21751() {
        for (Object context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof InterfaceC1423) {
                return (InterfaceC1423) context;
            }
        }
        throw new IllegalStateException("View is not attached to a LifecycleOwner");
    }
}
