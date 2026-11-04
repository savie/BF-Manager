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

/* JADX INFO: renamed from: l.ۨ᩶۫, reason: contains not printable characters */
/* JADX INFO: compiled from: U7J7 */
/* JADX INFO: loaded from: classes4.dex */
public class C12605 extends C18277 implements InterfaceC5252 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C23794 f40455;

    public C12605(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setKeyListener(null);
    }

    public C12605(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setKeyListener(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31317(C23794 c23794) {
        this.f40455 = c23794;
        if (c23794 == null) {
            setText((CharSequence) null);
        } else {
            setText(c23794.f1122);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23794 m31316() {
        return this.f40455;
    }

    @Override // android.widget.AutoCompleteTextView
    public final CharSequence convertSelectionToString(Object obj) {
        return (CharSequence) obj;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
        if (charSequence instanceof C3656) {
            super.replaceText(charSequence);
            this.f40455 = ((C3656) charSequence).f12516;
        } else if (charSequence instanceof C20810) {
            super.replaceText("");
            this.f40455 = null;
        } else {
            getContext().startActivity(new Intent(getContext(), (Class<?>) ActivityC0673.class));
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        List listM20795 = C7606.m20795();
        ArrayList arrayList = new ArrayList(listM20795.size() + 2);
        C20810 c20810 = new C20810(C21576.m49088(R.string.MT_Protector));
        c20810.setSpan(new ForegroundColorSpan(C3296.f10741), 0, c20810.length(), 17);
        arrayList.add(c20810);
        Iterator it = listM20795.iterator();
        while (it.hasNext()) {
            arrayList.add(new C3656((C23794) it.next()));
        }
        SpannableString spannableString = new SpannableString(C21576.m49088(R.string.MT_Protector));
        spannableString.setSpan(new ForegroundColorSpan(C3296.f10738), 0, spannableString.length(), 17);
        arrayList.add(spannableString);
        setAdapter(new C3054(getContext(), arrayList));
        super.showDropDown();
    }

    @Override // l.InterfaceC5252
    /* JADX INFO: renamed from: ۙ */
    public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
        C23794 c23794;
        if (enumC9330 != EnumC9330.ON_RESUME || (c23794 = this.f40455) == null) {
            return;
        }
        m31317(C7606.m20802(c23794.f1127));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        m31315().getLifecycle().mo23077(this);
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (isInEditMode()) {
            return;
        }
        m31315().getLifecycle().mo23078(this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private InterfaceC11217 m31315() {
        for (Object context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof InterfaceC11217) {
                return (InterfaceC11217) context;
            }
        }
        throw new IllegalStateException("View is not attached to a LifecycleOwner");
    }
}
