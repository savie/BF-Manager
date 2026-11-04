.class public final synthetic Ll/ܿܺ۫;
.super Ljava/lang/Object;
.source "795C"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ܰ:Ll/᩹ۖ᩸;

.field public final synthetic ᩶:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ۖ᩸;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿܺ۫;->ܰ:Ll/᩹ۖ᩸;

    iput-object p2, p0, Ll/ܿܺ۫;->᩶:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 2
    iget-object p1, p0, Ll/ܿܺ۫;->᩶:Ljava/util/ArrayList;

    .line 119
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷ۨᩴ;

    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Ll/ܿܺ۫;->ܰ:Ll/᩹ۖ᩸;

    invoke-virtual {p2, p1}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 120
    invoke-virtual {p2}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result p1

    invoke-virtual {p2, p1}, Ll/᩹ۖ᩸;->᩹(I)V

    return-void
.end method
