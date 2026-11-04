package l;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

/* JADX INFO: renamed from: l.᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: G58J */
/* JADX INFO: loaded from: classes5.dex */
public class C20756 {
    public final C17026 P;
    public final int mTheme;

    public C20756(Context context) {
        this(context, DialogInterfaceC12551.m31224(context, 0));
    }

    public C20756(Context context, int i) {
        this.P = new C17026(new ContextThemeWrapper(context, DialogInterfaceC12551.m31224(context, i)));
        this.mTheme = i;
    }

    public Context getContext() {
        return this.P.f55640;
    }

    public C20756 setTitle(int i) {
        C17026 c17026 = this.P;
        c17026.f55624 = c17026.f55640.getText(i);
        return this;
    }

    public C20756 setTitle(CharSequence charSequence) {
        this.P.f55624 = charSequence;
        return this;
    }

    public C20756 setCustomTitle(View view) {
        this.P.f55631 = view;
        return this;
    }

    public C20756 setMessage(int i) {
        C17026 c17026 = this.P;
        c17026.f55616 = c17026.f55640.getText(i);
        return this;
    }

    public C20756 setMessage(CharSequence charSequence) {
        this.P.f55616 = charSequence;
        return this;
    }

    public C20756 setIcon(int i) {
        this.P.f55614 = i;
        return this;
    }

    public C20756 setIcon(Drawable drawable) {
        this.P.f55620 = drawable;
        return this;
    }

    public C20756 setIconAttribute(int i) {
        TypedValue typedValue = new TypedValue();
        this.P.f55640.getTheme().resolveAttribute(i, typedValue, true);
        this.P.f55614 = typedValue.resourceId;
        return this;
    }

    public C20756 setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        C17026 c17026 = this.P;
        c17026.f55615 = c17026.f55640.getText(i);
        this.P.f55625 = onClickListener;
        return this;
    }

    public C20756 setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C17026 c17026 = this.P;
        c17026.f55615 = charSequence;
        c17026.f55625 = onClickListener;
        return this;
    }

    public C20756 setPositiveButtonIcon(Drawable drawable) {
        this.P.f55613 = drawable;
        return this;
    }

    public C20756 setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        C17026 c17026 = this.P;
        c17026.f55621 = c17026.f55640.getText(i);
        this.P.f55630 = onClickListener;
        return this;
    }

    public C20756 setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C17026 c17026 = this.P;
        c17026.f55621 = charSequence;
        c17026.f55630 = onClickListener;
        return this;
    }

    public C20756 setNegativeButtonIcon(Drawable drawable) {
        this.P.f55642 = drawable;
        return this;
    }

    public C20756 setNeutralButton(int i, DialogInterface.OnClickListener onClickListener) {
        C17026 c17026 = this.P;
        c17026.f55633 = c17026.f55640.getText(i);
        this.P.f55617 = onClickListener;
        return this;
    }

    public C20756 setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C17026 c17026 = this.P;
        c17026.f55633 = charSequence;
        c17026.f55617 = onClickListener;
        return this;
    }

    public C20756 setNeutralButtonIcon(Drawable drawable) {
        this.P.f55649 = drawable;
        return this;
    }

    public C20756 setCancelable(boolean z) {
        this.P.f55644 = z;
        return this;
    }

    public C20756 setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.P.f55643 = onCancelListener;
        return this;
    }

    public C20756 setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.P.f55623 = onDismissListener;
        return this;
    }

    public C20756 setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        this.P.f55626 = onKeyListener;
        return this;
    }

    public C20756 setItems(int i, DialogInterface.OnClickListener onClickListener) {
        C17026 c17026 = this.P;
        c17026.f55635 = c17026.f55640.getResources().getTextArray(i);
        this.P.f55612 = onClickListener;
        return this;
    }

    public C20756 setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        C17026 c17026 = this.P;
        c17026.f55635 = charSequenceArr;
        c17026.f55612 = onClickListener;
        return this;
    }

    public C20756 setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        C17026 c17026 = this.P;
        c17026.f55618 = listAdapter;
        c17026.f55612 = onClickListener;
        return this;
    }

    public C20756 setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
        C17026 c17026 = this.P;
        c17026.f55634 = cursor;
        c17026.f55648 = str;
        c17026.f55612 = onClickListener;
        return this;
    }

    public C20756 setMultiChoiceItems(int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        C17026 c17026 = this.P;
        c17026.f55635 = c17026.f55640.getResources().getTextArray(i);
        C17026 c17027 = this.P;
        c17027.f55638 = onMultiChoiceClickListener;
        c17027.f55646 = zArr;
        c17027.f55636 = true;
        return this;
    }

    public C20756 setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        C17026 c17026 = this.P;
        c17026.f55635 = charSequenceArr;
        c17026.f55638 = onMultiChoiceClickListener;
        c17026.f55646 = zArr;
        c17026.f55636 = true;
        return this;
    }

    public C20756 setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        C17026 c17026 = this.P;
        c17026.f55634 = cursor;
        c17026.f55638 = onMultiChoiceClickListener;
        c17026.f55650 = str;
        c17026.f55648 = str2;
        c17026.f55636 = true;
        return this;
    }

    public C20756 setSingleChoiceItems(int i, int i2, DialogInterface.OnClickListener onClickListener) {
        C17026 c17026 = this.P;
        c17026.f55635 = c17026.f55640.getResources().getTextArray(i);
        C17026 c17027 = this.P;
        c17027.f55612 = onClickListener;
        c17027.f55627 = i2;
        c17027.f55637 = true;
        return this;
    }

    public C20756 setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
        C17026 c17026 = this.P;
        c17026.f55634 = cursor;
        c17026.f55612 = onClickListener;
        c17026.f55627 = i;
        c17026.f55648 = str;
        c17026.f55637 = true;
        return this;
    }

    public C20756 setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        C17026 c17026 = this.P;
        c17026.f55635 = charSequenceArr;
        c17026.f55612 = onClickListener;
        c17026.f55627 = i;
        c17026.f55637 = true;
        return this;
    }

    public C20756 setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        C17026 c17026 = this.P;
        c17026.f55618 = listAdapter;
        c17026.f55612 = onClickListener;
        c17026.f55627 = i;
        c17026.f55637 = true;
        return this;
    }

    public C20756 setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.P.f55639 = onItemSelectedListener;
        return this;
    }

    public C20756 setView(int i) {
        C17026 c17026 = this.P;
        c17026.f55622 = null;
        c17026.f55632 = i;
        c17026.f55647 = false;
        return this;
    }

    public C20756 setView(View view) {
        C17026 c17026 = this.P;
        c17026.f55622 = view;
        c17026.f55632 = 0;
        c17026.f55647 = false;
        return this;
    }

    @Deprecated
    public C20756 setView(View view, int i, int i2, int i3, int i4) {
        C17026 c17026 = this.P;
        c17026.f55622 = view;
        c17026.f55632 = 0;
        c17026.f55647 = true;
        c17026.f55645 = i;
        c17026.f55641 = i2;
        c17026.f55628 = i3;
        c17026.f55619 = i4;
        return this;
    }

    @Deprecated
    public C20756 setInverseBackgroundForced(boolean z) {
        this.P.getClass();
        return this;
    }

    public C20756 setRecycleOnMeasureEnabled(boolean z) {
        this.P.getClass();
        return this;
    }

    public DialogInterfaceC12551 create() {
        int i;
        ListAdapter simpleCursorAdapter;
        DialogInterfaceC12551 dialogInterfaceC12551 = new DialogInterfaceC12551(this.P.f55640, this.mTheme);
        C17026 c17026 = this.P;
        View view = c17026.f55631;
        ContextThemeWrapper contextThemeWrapper = c17026.f55640;
        C3602 c3602 = dialogInterfaceC12551.f40321;
        if (view != null) {
            c3602.m11675(view);
        } else {
            CharSequence charSequence = c17026.f55624;
            if (charSequence != null) {
                c3602.m11680(charSequence);
            }
            Drawable drawable = c17026.f55620;
            if (drawable != null) {
                c3602.m11674(drawable);
            }
            int i2 = c17026.f55614;
            if (i2 != 0) {
                c3602.m11672(i2);
            }
        }
        CharSequence charSequence2 = c17026.f55616;
        if (charSequence2 != null) {
            c3602.m11677(charSequence2);
        }
        CharSequence charSequence3 = c17026.f55615;
        if (charSequence3 != null || c17026.f55613 != null) {
            c3602.m11673(-1, charSequence3, c17026.f55625, c17026.f55613);
        }
        CharSequence charSequence4 = c17026.f55621;
        if (charSequence4 != null || c17026.f55642 != null) {
            c3602.m11673(-2, charSequence4, c17026.f55630, c17026.f55642);
        }
        CharSequence charSequence5 = c17026.f55633;
        if (charSequence5 != null || c17026.f55649 != null) {
            c3602.m11673(-3, charSequence5, c17026.f55617, c17026.f55649);
        }
        if (c17026.f55635 != null || c17026.f55634 != null || c17026.f55618 != null) {
            C23740 c23740 = (C23740) c17026.f55629.inflate(c3602.f12322, (ViewGroup) null);
            if (c17026.f55636) {
                if (c17026.f55634 == null) {
                    simpleCursorAdapter = new C5840(c17026, contextThemeWrapper, c3602.f12324, c17026.f55635, c23740);
                } else {
                    simpleCursorAdapter = new C2111(c17026, contextThemeWrapper, c17026.f55634, c23740, c3602);
                }
            } else {
                if (c17026.f55637) {
                    i = c3602.f12321;
                } else {
                    i = c3602.f12309;
                }
                int i3 = i;
                if (c17026.f55634 != null) {
                    simpleCursorAdapter = new SimpleCursorAdapter(contextThemeWrapper, i3, c17026.f55634, new String[]{c17026.f55648}, new int[]{R.id.text1});
                } else {
                    ListAdapter c16280 = c17026.f55618;
                    if (c16280 == null) {
                        c16280 = new C16280(contextThemeWrapper, i3, R.id.text1, c17026.f55635);
                    }
                    simpleCursorAdapter = c16280;
                }
            }
            c3602.f12316 = simpleCursorAdapter;
            c3602.f12343 = c17026.f55627;
            if (c17026.f55612 != null) {
                c23740.setOnItemClickListener(new C11805(c17026, c3602));
            } else if (c17026.f55638 != null) {
                c23740.setOnItemClickListener(new C25232(c17026, c23740, c3602));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = c17026.f55639;
            if (onItemSelectedListener != null) {
                c23740.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (c17026.f55637) {
                c23740.setChoiceMode(1);
            } else if (c17026.f55636) {
                c23740.setChoiceMode(2);
            }
            c3602.f12340 = c23740;
        }
        View view2 = c17026.f55622;
        if (view2 != null) {
            if (c17026.f55647) {
                c3602.m11676(view2, c17026.f55645, c17026.f55641, c17026.f55628, c17026.f55619);
            } else {
                c3602.m11679(view2);
            }
        } else {
            int i4 = c17026.f55632;
            if (i4 != 0) {
                c3602.m11678(i4);
            }
        }
        dialogInterfaceC12551.setCancelable(this.P.f55644);
        if (this.P.f55644) {
            dialogInterfaceC12551.setCanceledOnTouchOutside(true);
        }
        dialogInterfaceC12551.setOnCancelListener(this.P.f55643);
        dialogInterfaceC12551.setOnDismissListener(this.P.f55623);
        DialogInterface.OnKeyListener onKeyListener = this.P.f55626;
        if (onKeyListener != null) {
            dialogInterfaceC12551.setOnKeyListener(onKeyListener);
        }
        return dialogInterfaceC12551;
    }

    public DialogInterfaceC12551 show() {
        DialogInterfaceC12551 dialogInterfaceC12551Create = create();
        dialogInterfaceC12551Create.show();
        return dialogInterfaceC12551Create;
    }
}
