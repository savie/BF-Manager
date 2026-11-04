package l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextPaint;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1KB */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC8019 extends AbstractC11800 implements View.OnClickListener, View.OnLongClickListener, InterfaceC21436 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f26626;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f26627;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19206 f26628;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f26629;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC8019(C19206 c19206, View view) {
        super(view);
        this.f26628 = c19206;
        this.f26626 = (TextView) view.findViewById(R.id.textView);
        this.f26629 = (TextView) view.findViewById(R.id.textView2);
        C17423.m40915(view);
        ((ImageView) view.findViewById(R.id.icon)).setImageDrawable(c19206.f62120.f48794);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21887(String str) {
        int i;
        int i2;
        String strM44060 = C18969.m44060(50, C15306.m36751(str));
        TextView textView = this.f26626;
        textView.setText(strM44060);
        String strM44061 = C18969.m44060(200, str);
        TextView textView2 = this.f26629;
        textView2.setText(strM44061);
        TextPaint paint = textView.getPaint();
        TextPaint paint2 = textView2.getPaint();
        int flags = paint.getFlags();
        int flags2 = paint2.getFlags();
        C19206 c19206 = this.f26628;
        if (c19206.f62122 == null || c19206.f62122.m30009(str)) {
            this.f26627 = true;
            i = flags & (-17);
            i2 = flags2 & (-17);
            textView.setTextColor(C3296.f10751);
            textView2.setTextColor(C3296.f10751);
        } else {
            this.f26627 = false;
            i = flags | 16;
            i2 = flags2 | 16;
            textView.setTextColor(C3296.f10779);
            textView2.setTextColor(C3296.f10779);
        }
        paint.setFlags(i);
        paint2.setFlags(i2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C14941.f48783.m55200()) {
            return;
        }
        final String string = this.f26629.getText().toString();
        C19206 c19206 = this.f26628;
        if (c19206.f62122 != null && !c19206.f62122.m30009(string)) {
            m21886(string);
        } else {
            C21576.m49069(new Runnable() { // from class: l.ܿܽۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C19206 c19207 = this.f60084.f26628;
                    if (c19207.f62122 != null) {
                        c19207.f62122.m29972(string);
                    }
                }
            }, 500L);
            ((ActivityC0848) c19206.requireActivity()).m3452(string, (C15301) null);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C18452 c18452 = new C18452(this.f26628.requireContext(), view, 0);
        if (this.f26627) {
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42994(this);
        c18452.mo21878();
        return true;
    }

    @Override // l.InterfaceC21436
    public final boolean onMenuItemClick(MenuItem menuItem) {
        String string = this.f26629.getText().toString();
        int itemId = menuItem.getItemId();
        C19206 c19206 = this.f26628;
        if (itemId == R.string.MT_Protector) {
            c19206.f62119.m51327(string);
            return true;
        }
        if (c19206.f62122 == null) {
            return true;
        }
        m21886(string);
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m21886(final String str) {
        C19206 c19206 = this.f26628;
        Context contextRequireContext = c19206.requireContext();
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(contextRequireContext);
        c2361.m8021(R.string.MT_Protector);
        c2361.m8008(c19206.getString(R.string.MT_Protector, this.f26626.getText()));
        c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡ܽۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f2294.f26628.f62122.m29992(str);
            }
        });
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8016();
    }
}
