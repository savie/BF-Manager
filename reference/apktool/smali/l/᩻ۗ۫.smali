.class public final synthetic Ll/᩻ۗ۫;
.super Ljava/lang/Object;
.source "5AG9"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ܰ:Ll/᩹ۖ᩸;

.field public final synthetic ᩶:[Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ۖ᩸;[Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ۗ۫;->ܰ:Ll/᩹ۖ᩸;

    iput-object p2, p0, Ll/᩻ۗ۫;->᩶:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/᩻ۗ۫;->᩶:[Ljava/lang/String;

    .line 488
    aget-object p2, v0, p2

    iget-object v0, p0, Ll/᩻ۗ۫;->ܰ:Ll/᩹ۖ᩸;

    invoke-virtual {v0, p2}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 489
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
