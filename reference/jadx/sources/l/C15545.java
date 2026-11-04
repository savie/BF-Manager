package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1599 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15545 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f50565 = true;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f50566 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37229(final C12628 c12628) {
        Context context = c12628.getContext();
        View viewInflate = View.inflate(context, R.layout.MT_Protector, null);
        final C23255 c23255 = (C23255) viewInflate.findViewById(R.id.MT_Protector);
        final C23255 c23256 = (C23255) viewInflate.findViewById(R.id.editText2);
        final TextView textView = (TextView) viewInflate.findViewById(R.id.textView);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.MT_Protector);
        CheckBox checkBox2 = (CheckBox) viewInflate.findViewById(R.id.checkBox2);
        checkBox.setChecked(f50566);
        checkBox2.setChecked(f50565);
        C5917 c5917 = c12628.f40509;
        int iM17202 = c5917.m17202();
        m37231(c23255, iM17202);
        if (c5917.m17206()) {
            int iM17208 = c5917.m17208();
            if (f50566) {
                m37231(c23256, (iM17208 - iM17202) + 1);
            } else {
                textView.setText(R.string.MT_Protector);
                m37231(c23256, iM17208);
            }
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۬᩸ܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C15545.m37228(textView, c23255, c23256, c12628, z);
            }
        });
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۙᩴܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C15545.m37234(c23255, c23256, c12628, z);
            }
        });
        c23255.m53899(new C20021(c23255, c23256, c12628));
        m37235(c23255, c23256, c5917.m17218());
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(context);
        c2361.m8005(viewInflate);
        c2361.m8026(R.string.MT_Protector, null);
        final DialogInterfaceC8327 dialogInterfaceC8327M23911 = C8947.m23911(c2361, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC8327M23911.m22440().setOnClickListener(new ViewOnClickListenerC22259(c12628, c23255, c23256, 0));
        dialogInterfaceC8327M23911.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ۤᩴܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C15545.m37233(c23255, c23256, c12628, dialogInterfaceC8327M23911);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37228(TextView textView, C23255 c23255, C23255 c23256, C12628 c12628, boolean z) {
        f50566 = z;
        int i = 16;
        try {
            if (z) {
                textView.setText(R.string.MT_Protector);
                int i2 = Integer.parseInt(c23255.m54021().toString(), f50565 ? 16 : 10);
                String string = c23256.m54021().toString();
                if (!f50565) {
                    i = 10;
                }
                int i3 = Integer.parseInt(string, i);
                if (i3 < i2) {
                    m37231(c23255, i3);
                    m37231(c23256, (i2 - i3) + 1);
                } else {
                    m37231(c23256, (i3 - i2) + 1);
                }
            } else {
                textView.setText(R.string.MT_Protector);
                int i4 = Integer.parseInt(c23255.m54021().toString(), f50565 ? 16 : 10);
                String string2 = c23256.m54021().toString();
                if (!f50565) {
                    i = 10;
                }
                long j = (((long) i4) + ((long) Integer.parseInt(string2, i))) - 1;
                if (j < -2147483648L || j > 2147483647L) {
                    throw new NumberFormatException();
                }
                m37231(c23256, (int) j);
            }
        } catch (NumberFormatException unused) {
        }
        m37235(c23255, c23256, c12628.f40509.m17218());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37234(C23255 c23255, C23255 c23256, C12628 c12628, boolean z) {
        f50565 = z;
        try {
            m37231(c23255, Integer.parseInt(c23255.m54021().toString(), f50565 ? 10 : 16));
        } catch (NumberFormatException unused) {
        }
        try {
            m37231(c23256, Integer.parseInt(c23256.m54021().toString(), f50565 ? 10 : 16));
        } catch (NumberFormatException unused2) {
        }
        m37235(c23255, c23256, c12628.f40509.m17218());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37230(C12628 c12628, C23255 c23255, C23255 c23256, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        C5917 c5917 = c12628.f40509;
        int iM17218 = c5917.m17218();
        if (itemId == 17039373) {
            if (f50566) {
                m37231(c23255, 0);
                m37231(c23256, iM17218);
                return;
            } else {
                m37231(c23255, 0);
                m37231(c23256, Math.max(iM17218 - 1, 0));
                return;
            }
        }
        if (itemId == R.string.MT_Protector) {
            if (f50566) {
                m37231(c23255, 0);
                m37231(c23256, iM17218 != 0 ? c5917.m17208() + 1 : 0);
                return;
            } else {
                m37231(c23255, 0);
                return;
            }
        }
        if (itemId == R.string.MT_Protector) {
            if (f50566) {
                m37231(c23256, iM17218 - c5917.m17202());
            } else {
                m37231(c23256, Math.max(iM17218 - 1, 0));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37233(C23255 c23255, C23255 c23256, C12628 c12628, DialogInterfaceC8327 dialogInterfaceC8327) {
        int i;
        C5917 c5917 = c12628.f40509;
        try {
            int i2 = Integer.parseInt(c23255.m54021().toString(), f50565 ? 16 : 10);
            try {
                int i3 = Integer.parseInt(c23256.m54021().toString(), f50565 ? 16 : 10);
                int iM17218 = c5917.m17218();
                if (f50566) {
                    try {
                        if (iM17218 < 0 || i2 < 0 || i2 > iM17218 || i3 < 0) {
                            throw new IllegalArgumentException("Selection range is out of bounds");
                        }
                        if (i3 == 0) {
                            i = i2;
                        } else {
                            long j = (((long) i2) + ((long) i3)) - 1;
                            if (i2 == iM17218 || j >= iM17218) {
                                throw new IllegalArgumentException("Selection range is out of bounds");
                            }
                            i = (int) j;
                        }
                        if (i3 == 0) {
                            c5917.m17193(i2, true);
                            c12628.invalidate();
                            c12628.m31367(c5917.m17202());
                            dialogInterfaceC8327.dismiss();
                            return;
                        }
                        i3 = i;
                    } catch (IllegalArgumentException unused) {
                        C22673.m51158(R.string.MT_Protector, 0).m51163();
                        return;
                    }
                } else {
                    if (iM17218 == 0 && i2 == 0 && i3 == 0) {
                        c5917.m17193(0, true);
                        c12628.invalidate();
                        c12628.m31367(c5917.m17202());
                        dialogInterfaceC8327.dismiss();
                        return;
                    }
                    if (i2 > i3) {
                        i3 = i2;
                        i2 = i3;
                    }
                }
                if (i2 < 0 || i3 >= iM17218) {
                    C22673.m51158(R.string.MT_Protector, 0).m51163();
                } else {
                    c12628.m31357(i2, i3);
                    dialogInterfaceC8327.dismiss();
                }
            } catch (NumberFormatException unused2) {
                c23256.requestFocus();
                C22673.m51158(R.string.MT_Protector, 0).m51163();
            }
        } catch (NumberFormatException unused3) {
            c23255.requestFocus();
            C22673.m51158(R.string.MT_Protector, 0).m51163();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m37235(C23255 c23255, C23255 c23256, int i) {
        try {
            int i2 = Integer.parseInt(c23255.m54021().toString(), f50565 ? 16 : 10);
            if (i2 >= i) {
                throw new NumberFormatException();
            }
            if (f50566) {
                int i3 = i - i2;
                if (f50565) {
                    c23256.m52337("1…" + Integer.toHexString(i3).toUpperCase());
                    return;
                } else {
                    c23256.m52337("1…" + i3);
                    return;
                }
            }
            int i4 = i - 1;
            if (f50565) {
                c23256.m52337(Integer.toHexString(i2).toUpperCase() + "…" + Integer.toHexString(i4).toUpperCase());
                return;
            }
            c23256.m52337(i2 + "…" + i4);
        } catch (NumberFormatException unused) {
            c23256.m52337((String) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37231(C23255 c23255, int i) {
        c23255.mo52335((CharSequence) Integer.toString(i, f50565 ? 16 : 10).toUpperCase());
        c23255.mo52339(c23255.m54099());
    }
}
