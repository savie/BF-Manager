package l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnClickListenerC23950 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f77519 = new ArrayList();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17771 f77520;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C1255 f77521;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C17771 f77522;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final View f77523;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f77524;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f77525;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17771 f77526;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1255 f77527;

    /* JADX INFO: renamed from: ۚ */
    public abstract void mo6150();

    static {
        byte[] bArrMo7903 = ApplicationC17729.f58258.mo7903("mrir", (byte[]) null);
        if (bArrMo7903 != null) {
            C20348 c20348 = new C20348(bArrMo7903);
            int i = c20348.readByte() & 255;
            for (int i2 = 0; i2 < i; i2++) {
                f77519.add(C6050.m17558(c20348));
            }
        }
    }

    public AbstractViewOnClickListenerC23950(AbstractActivityC17204 abstractActivityC17204, ArrayList arrayList, boolean z, boolean z2) {
        this.f77524 = abstractActivityC17204;
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        viewM40395.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC8386(1, abstractActivityC17204, arrayList));
        C17771 c17771 = (C17771) viewM40395.findViewById(R.id.MT_Protector);
        this.f77520 = c17771;
        C17771 c17772 = (C17771) viewM40395.findViewById(R.id.editText2);
        this.f77522 = c17772;
        C17771 c17773 = (C17771) viewM40395.findViewById(R.id.editText3);
        this.f77526 = c17773;
        C1255 c1255 = (C1255) viewM40395.findViewById(R.id.switch1);
        this.f77521 = c1255;
        this.f77527 = (C1255) viewM40395.findViewById(R.id.switch2);
        View viewFindViewById = viewM40395.findViewById(R.id.MT_Protector);
        this.f77523 = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC6591(2, this));
        viewFindViewById.setEnabled(!f77519.isEmpty());
        c17771.m41594("{P}{S}");
        c17771.m41605().m52294();
        c17772.m41594("");
        c17773.m41594("");
        c1255.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.֫֨ܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                AbstractViewOnClickListenerC23950 abstractViewOnClickListenerC23950 = this.f5461;
                abstractViewOnClickListenerC23950.f77522.m41606(z3);
                abstractViewOnClickListenerC23950.f77526.m41600(z3);
            }
        });
        c1255.setChecked(ApplicationC17729.f58258.getBoolean("rename_multi_regex", false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = abstractActivityC17204.getString(R.string.MT_Protector);
        int iLastIndexOf = string.lastIndexOf("\n\n");
        int iIndexOf = string.indexOf("\n{N}");
        if (iLastIndexOf == -1 || iIndexOf == -1 || iLastIndexOf < iIndexOf) {
            throw new IllegalStateException(string);
        }
        spannableStringBuilder.append((CharSequence) string, 0, iIndexOf).append((CharSequence) "\n");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) abstractActivityC17204.getString(R.string.MT_Protector));
        RunnableC11269 runnableC11269 = new RunnableC11269(this, abstractActivityC17204);
        C4245 c4245Matcher = C18415.m42925("%.+?%").matcher((CharSequence) spannableStringBuilder);
        if (c4245Matcher.find(length)) {
            spannableStringBuilder.delete(c4245Matcher.end() - 1, c4245Matcher.end());
            spannableStringBuilder.delete(c4245Matcher.start(), c4245Matcher.start() + 1);
            spannableStringBuilder.setSpan(new C23204(runnableC11269), c4245Matcher.start(), c4245Matcher.end() - 2, 17);
            if (z2) {
                spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) abstractActivityC17204.getString(R.string.MT_Protector));
            }
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.25f), spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 17);
            spannableStringBuilder.append((CharSequence) string, iIndexOf + 1, iLastIndexOf);
            if (z) {
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.25f), spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 17);
                spannableStringBuilder.append((CharSequence) abstractActivityC17204.getString(R.string.MT_Protector));
            }
            spannableStringBuilder.append((CharSequence) string, iLastIndexOf, string.length());
            C24940.m55623((TextView) viewM40395.findViewById(R.id.MT_Protector), spannableStringBuilder, true, C24940.m55622(c17771.m41605()));
            C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
            c2361BuildDialog.m8005(viewM40395);
            c2361BuildDialog.m8012(false);
            c2361BuildDialog.m8026(R.string.MT_Protector, null);
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            DialogInterfaceC8327 dialogInterfaceC8327M7999 = c2361BuildDialog.m7999();
            this.f77525 = dialogInterfaceC8327M7999;
            C21232.m48398(dialogInterfaceC8327M7999);
            return;
        }
        throw new IllegalStateException(abstractActivityC17204.getString(R.string.MT_Protector));
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m53480() {
        C6178 c6178 = new C6178();
        ArrayList arrayList = f77519;
        c6178.writeByte(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C6050) it.next()).m17563(c6178);
        }
        ApplicationC17729.f58258.edit().mo3488("mrir", c6178.m17796()).apply();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m53481() {
        C6050 c6050 = new C6050(0, m53486(), m53487(), m53489(), this.f77521.isChecked());
        ArrayList arrayList = f77519;
        arrayList.remove(c6050);
        arrayList.add(0, c6050);
        while (arrayList.size() > 100) {
            C2764.m9138(arrayList, 1);
        }
        m53480();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m53476(final View view) {
        final CharSequence[] charSequenceArr = (CharSequence[]) C1170.stream(f77519).map(new C24696()).toArray(new C16490());
        C2361 c2361BuildDialog = this.f77524.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8014(charSequenceArr, new DialogInterfaceOnClickListenerC0212(2, this));
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        dialogInterfaceC8327M8016.m22437().setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.ܽ֨ܳ
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view2, final int i, long j) {
                final AbstractViewOnClickListenerC23950 abstractViewOnClickListenerC23950 = this.f56162;
                C2361 c2361BuildDialog2 = abstractViewOnClickListenerC23950.f77524.buildDialog();
                c2361BuildDialog2.m8021(R.string.MT_Protector);
                c2361BuildDialog2.m8008(charSequenceArr[i]);
                final DialogInterfaceC8327 dialogInterfaceC8327 = dialogInterfaceC8327M8016;
                final View view3 = view;
                c2361BuildDialog2.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܶ֨ܳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        AbstractViewOnClickListenerC23950.m53478(abstractViewOnClickListenerC23950, i, dialogInterfaceC8327, view3);
                    }
                });
                c2361BuildDialog2.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c2361BuildDialog2.m8016();
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53477(AbstractViewOnClickListenerC23950 abstractViewOnClickListenerC23950, int i) {
        C6050 c6050 = (C6050) f77519.get(i);
        abstractViewOnClickListenerC23950.f77520.m41594(c6050.f20694);
        abstractViewOnClickListenerC23950.f77522.m41594(c6050.f20697);
        abstractViewOnClickListenerC23950.f77526.m41594(c6050.f20695);
        abstractViewOnClickListenerC23950.f77521.setChecked(c6050.f20696);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m53478(AbstractViewOnClickListenerC23950 abstractViewOnClickListenerC23950, int i, DialogInterfaceC8327 dialogInterfaceC8327, View view) {
        ArrayList arrayList = f77519;
        arrayList.remove(i);
        m53480();
        dialogInterfaceC8327.dismiss();
        if (arrayList.isEmpty()) {
            abstractViewOnClickListenerC23950.f77523.setEnabled(false);
        } else {
            abstractViewOnClickListenerC23950.m53476(view);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53482() {
        this.f77525.dismiss();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m53486() {
        return this.f77520.m41599().toString();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m53487() {
        return this.f77522.m41599().toString();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m53489() {
        return this.f77526.m41599().toString();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m53485() {
        return this.f77521.isChecked();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m53490() {
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f77525;
        dialogInterfaceC8327.m22432();
        dialogInterfaceC8327.m22436().setOnClickListener(this);
        C5416.m16144(dialogInterfaceC8327);
        C21576.m49090(this.f77520);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1255 m53488() {
        C1255 c1255 = this.f77527;
        c1255.setVisibility(0);
        return c1255;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 m53483() {
        return this.f77525;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m53484() {
        C17771 c17771 = this.f77520;
        if (c17771.m41607() > 0 && !m53486().equals("{P}{S}")) {
            c17771.m41603();
        }
        C17771 c17772 = this.f77522;
        if (c17772.m41607() > 0) {
            c17772.m41603();
        }
        C17771 c17773 = this.f77526;
        if (c17773.m41607() > 0) {
            c17773.m41603();
        }
        ApplicationC17729.f58258.edit().putBoolean("rename_multi_regex", this.f77521.isChecked()).apply();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == 16908313) {
            if (this.f77521.isChecked()) {
                try {
                    C18415.m42925(m53487());
                } catch (Exception e) {
                    this.f77524.m40401(e, (DialogInterface.OnDismissListener) null);
                    C17771 c17771 = this.f77522;
                    c17771.m41590();
                    c17771.requestFocus();
                    return;
                }
            }
            mo6150();
        }
    }
}
