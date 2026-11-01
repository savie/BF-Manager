package l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡ۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractViewOnClickListenerC8744 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final ArrayList f30050 = new ArrayList();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 f30051;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final View f30052;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12562 f30053;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C9160 f30054;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f30055;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9160 f30056;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9160 f30057;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12562 f30058;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public abstract void mo22696();

    static {
        byte[] bArrMo16347 = ApplicationC0716.f2992.mo16347("mrir", (byte[]) null);
        if (bArrMo16347 != null) {
            C17367 c17367 = new C17367(bArrMo16347);
            int i = c17367.readByte() & 255;
            for (int i2 = 0; i2 < i; i2++) {
                f30050.add(C19327.m44311(c17367));
            }
        }
    }

    public AbstractViewOnClickListenerC8744(AbstractActivityC12483 abstractActivityC12483, ArrayList arrayList, boolean z, boolean z2) {
        this.f30055 = abstractActivityC12483;
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC10486(1, abstractActivityC12483, arrayList));
        C9160 c9160 = (C9160) viewM30995.findViewById(R.id.MT_Protector);
        this.f30056 = c9160;
        C9160 c9161 = (C9160) viewM30995.findViewById(R.id.editText2);
        this.f30054 = c9161;
        C9160 c9162 = (C9160) viewM30995.findViewById(R.id.editText3);
        this.f30057 = c9162;
        C12562 c12562 = (C12562) viewM30995.findViewById(R.id.switch1);
        this.f30053 = c12562;
        this.f30058 = (C12562) viewM30995.findViewById(R.id.switch2);
        View viewFindViewById = viewM30995.findViewById(R.id.MT_Protector);
        this.f30052 = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC6505(3, this));
        viewFindViewById.setEnabled(!f30050.isEmpty());
        c9160.m23507("{P}{S}");
        c9160.m23516().m27470();
        c9161.m23507("");
        c9162.m23507("");
        c12562.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.֨۟᩹
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                AbstractViewOnClickListenerC8744 abstractViewOnClickListenerC8744 = this.f4617;
                abstractViewOnClickListenerC8744.f30054.m23518(z3);
                abstractViewOnClickListenerC8744.f30057.m23514(z3);
            }
        });
        c12562.setChecked(ApplicationC0716.f2992.getBoolean("rename_multi_regex", false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = abstractActivityC12483.getString(R.string.MT_Protector);
        int iLastIndexOf = string.lastIndexOf("\n\n");
        int iIndexOf = string.indexOf("\n{N}");
        if (iLastIndexOf == -1 || iIndexOf == -1 || iLastIndexOf < iIndexOf) {
            throw new IllegalStateException(string);
        }
        spannableStringBuilder.append((CharSequence) string, 0, iIndexOf).append((CharSequence) "\n");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) abstractActivityC12483.getString(R.string.MT_Protector));
        RunnableC12977 runnableC12977 = new RunnableC12977(this, abstractActivityC12483);
        C6222 c6222Matcher = C14690.m35219("%.+?%").matcher((CharSequence) spannableStringBuilder);
        if (c6222Matcher.find(length)) {
            spannableStringBuilder.delete(c6222Matcher.end() - 1, c6222Matcher.end());
            spannableStringBuilder.delete(c6222Matcher.start(), c6222Matcher.start() + 1);
            spannableStringBuilder.setSpan(new C21443(runnableC12977), c6222Matcher.start(), c6222Matcher.end() - 2, 17);
            if (z2) {
                spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) abstractActivityC12483.getString(R.string.MT_Protector));
            }
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.25f), spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 17);
            spannableStringBuilder.append((CharSequence) string, iIndexOf + 1, iLastIndexOf);
            if (z) {
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.25f), spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 17);
                spannableStringBuilder.append((CharSequence) abstractActivityC12483.getString(R.string.MT_Protector));
            }
            C6222 c6222Matcher2 = C14690.m35218(8, "^\\{\\w+\\}").matcher((CharSequence) spannableStringBuilder);
            while (c6222Matcher2.find()) {
                spannableStringBuilder.setSpan(new StyleSpan(1), c6222Matcher2.start(), c6222Matcher2.end(), 17);
            }
            spannableStringBuilder.append((CharSequence) string, iLastIndexOf, string.length());
            TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
            c8067BuildDialog.m21258(viewM30995);
            c8067BuildDialog.m21265(false);
            c8067BuildDialog.m21251(R.string.MT_Protector, null);
            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21278("{  }", (DialogInterface.OnClickListener) null);
            DialogInterfaceC19356 dialogInterfaceC19356M21252 = c8067BuildDialog.m21252();
            this.f30051 = dialogInterfaceC19356M21252;
            C8875.m23019(dialogInterfaceC19356M21252);
            return;
        }
        throw new IllegalStateException(abstractActivityC12483.getString(R.string.MT_Protector));
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static void m22688() {
        C11018 c11018 = new C11018();
        ArrayList arrayList = f30050;
        c11018.writeByte(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C19327) it.next()).m44315(c11018);
        }
        ApplicationC0716.f2992.edit().mo4067("mrir", c11018.m27773()).apply();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m22691() {
        C19327 c19327 = new C19327(0, m22698(), m22693(), m22690(), this.f30053.isChecked());
        ArrayList arrayList = f30050;
        arrayList.remove(c19327);
        arrayList.add(0, c19327);
        while (arrayList.size() > 100) {
            C19028.m43762(arrayList, 1);
        }
        m22688();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m22684(final View view) {
        final CharSequence[] charSequenceArr = (CharSequence[]) C9030.stream(f30050).map(new C3803()).toArray(new C6626());
        C8067 c8067BuildDialog = this.f30055.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21267(charSequenceArr, new DialogInterfaceOnClickListenerC8211(1, this));
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        dialogInterfaceC19356M21269.m44376().setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.᩺۟᩹
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view2, final int i, long j) {
                final AbstractViewOnClickListenerC8744 abstractViewOnClickListenerC8744 = this.f74355;
                C8067 c8067BuildDialog2 = abstractViewOnClickListenerC8744.f30055.buildDialog();
                c8067BuildDialog2.m21274(R.string.MT_Protector);
                c8067BuildDialog2.m21261(charSequenceArr[i]);
                final DialogInterfaceC19356 dialogInterfaceC19356 = dialogInterfaceC19356M21269;
                final View view3 = view;
                c8067BuildDialog2.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܶ۟᩹
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        AbstractViewOnClickListenerC8744.m22686(abstractViewOnClickListenerC8744, i, dialogInterfaceC19356, view3);
                    }
                });
                c8067BuildDialog2.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c8067BuildDialog2.m21269();
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22685(AbstractViewOnClickListenerC8744 abstractViewOnClickListenerC8744, int i) {
        C19327 c19327 = (C19327) f30050.get(i);
        abstractViewOnClickListenerC8744.f30056.m23507(c19327.f62341);
        abstractViewOnClickListenerC8744.f30054.m23507(c19327.f62340);
        abstractViewOnClickListenerC8744.f30057.m23507(c19327.f62342);
        abstractViewOnClickListenerC8744.f30053.setChecked(c19327.f62343);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22686(AbstractViewOnClickListenerC8744 abstractViewOnClickListenerC8744, int i, DialogInterfaceC19356 dialogInterfaceC19356, View view) {
        ArrayList arrayList = f30050;
        arrayList.remove(i);
        m22688();
        dialogInterfaceC19356.dismiss();
        if (arrayList.isEmpty()) {
            abstractViewOnClickListenerC8744.f30052.setEnabled(false);
        } else {
            abstractViewOnClickListenerC8744.m22684(view);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22692() {
        this.f30051.dismiss();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m22698() {
        return this.f30056.m23513().toString();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m22693() {
        return this.f30054.m23513().toString();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m22690() {
        return this.f30057.m23513().toString();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m22689() {
        return this.f30053.isChecked();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m22699() {
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f30051;
        dialogInterfaceC19356.m44362();
        dialogInterfaceC19356.m44373().setOnClickListener(this);
        dialogInterfaceC19356.m44361().setOnClickListener(this);
        C16737.m39290(this.f30056);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12562 m22697() {
        C12562 c12562 = this.f30058;
        c12562.setVisibility(0);
        return c12562;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 m22695() {
        return this.f30051;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m22694() {
        C9160 c9160 = this.f30056;
        if (c9160.m23502() > 0 && !m22698().equals("{P}{S}")) {
            c9160.m23519();
        }
        C9160 c9161 = this.f30054;
        if (c9161.m23502() > 0) {
            c9161.m23519();
        }
        C9160 c9162 = this.f30057;
        if (c9162.m23502() > 0) {
            c9162.m23519();
        }
        ApplicationC0716.f2992.edit().putBoolean("rename_multi_regex", this.f30053.isChecked()).apply();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == 16908313) {
            if (this.f30053.isChecked()) {
                try {
                    C14690.m35219(m22693());
                } catch (Exception e) {
                    this.f30055.m31002(e, (DialogInterface.OnDismissListener) null);
                    C9160 c9160 = this.f30054;
                    c9160.m23503();
                    c9160.requestFocus();
                    return;
                }
            }
            mo22696();
            return;
        }
        C9160 c9161 = this.f30056;
        int iM16916 = c9161.m23516().m16916();
        int iM17020 = c9161.m23516().m17020();
        c9161.requestFocus();
        c9161.m23513().replace(iM16916, iM17020, "{}");
        c9161.m23517(iM16916 + 1);
    }
}
