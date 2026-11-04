package l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextPaint;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1KB */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC17321 extends AbstractC11800 implements View.OnClickListener, View.OnLongClickListener, InterfaceC21436 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15829 f56410;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public TextView f56411;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C0408 f56412;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TextView f56413;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f56414;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC17321(C15829 c15829, View view) {
        super(view);
        this.f56410 = c15829;
        this.f56411 = (TextView) view.findViewById(R.id.textView);
        this.f56413 = (TextView) view.findViewById(R.id.textView2);
        C17423.m40915(view);
        ((ImageView) view.findViewById(R.id.icon)).setImageDrawable(c15829.f51493.f48794);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40669(String str) {
        int i;
        int i2;
        String strM44060 = C18969.m44060(50, C15306.m36751(str));
        TextView textView = this.f56411;
        textView.setText(strM44060);
        String strM44061 = C18969.m44060(200, str);
        TextView textView2 = this.f56413;
        textView2.setText(strM44061);
        TextPaint paint = textView.getPaint();
        TextPaint paint2 = textView2.getPaint();
        int flags = paint.getFlags();
        int flags2 = paint2.getFlags();
        C15829 c15829 = this.f56410;
        if (c15829.f51495 == null || c15829.f51495.m46617(str)) {
            this.f56414 = true;
            i = flags & (-17);
            i2 = flags2 & (-17);
            textView.setTextColor(C3296.f10751);
            textView2.setTextColor(C3296.f10751);
        } else {
            this.f56414 = false;
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
        final String string = this.f56413.getText().toString();
        C15829 c15829 = this.f56410;
        if (c15829.f51495 != null && !c15829.f51495.m46617(string)) {
            m40668(string);
        } else {
            C21576.m49069(new Runnable() { // from class: l.᩻ۘۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C15829 c158210 = this.f80223.f56410;
                    if (c158210.f51495 != null) {
                        c158210.f51495.m46575(string);
                    }
                }
            }, 500L);
            ((ActivityC0848) c15829.requireActivity()).m3431(string, (C15301) null);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C18452 c18452 = new C18452(this.f56410.requireContext(), view, 0);
        this.f56412 = new C0408(c18452, this.f56413.getText().toString(), true);
        if (this.f56414) {
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42994(this);
        c18452.mo21878();
        return true;
    }

    @Override // l.InterfaceC21436
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (!this.f56412.m2214(menuItem)) {
            String string = this.f56413.getText().toString();
            int itemId = menuItem.getItemId();
            C15829 c15829 = this.f56410;
            if (itemId == R.string.MT_Protector) {
                c15829.f51492.m51298(string);
                return true;
            }
            if (c15829.f51495 != null) {
                m40668(string);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m40668(final String str) {
        C15829 c15829 = this.f56410;
        Context contextRequireContext = c15829.requireContext();
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(contextRequireContext);
        c2361.m8021(R.string.MT_Protector);
        c2361.m8008(c15829.getString(R.string.MT_Protector, this.f56411.getText()));
        c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܺۘۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f53648.f56410.f51495.m46572(str);
            }
        });
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8016();
    }
}
