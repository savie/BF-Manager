.class public final synthetic Ll/ۛۘᩴ;
.super Ljava/lang/Object;
.source "313O"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ܰ:Ljava/text/Collator;


# direct methods
.method public synthetic constructor <init>(Ljava/text/Collator;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛۘᩴ;->ܰ:Ljava/text/Collator;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .line 2
    check-cast p1, Ll/᩷ܰᩴ;

    .line 4
    check-cast p2, Ll/᩷ܰᩴ;

    .line 579
    iget v0, p2, Ll/᩷ܰᩴ;->ۤ:I

    iget-object v1, p2, Ll/᩷ܰᩴ;->ۙ:Ll/ܽۘᩴ;

    iget v2, p1, Ll/᩷ܰᩴ;->ۤ:I

    iget-object v3, p1, Ll/᩷ܰᩴ;->ۙ:Ll/ܽۘᩴ;

    invoke-static {v0, v2}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-nez v0, :cond_0

    .line 580
    iget v0, p2, Ll/᩷ܰᩴ;->ܳ:I

    iget v2, p1, Ll/᩷ܰᩴ;->ܳ:I

    invoke-static {v0, v2}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    :cond_0
    if-nez v0, :cond_1

    .line 581
    iget-object p1, p1, Ll/᩷ܰᩴ;->ᩴ:Ljava/lang/String;

    iget-object p2, p2, Ll/᩷ܰᩴ;->ᩴ:Ljava/lang/String;

    iget-object v0, p0, Ll/ۛۘᩴ;->ܰ:Ljava/text/Collator;

    invoke-virtual {v0, p1, p2}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    :cond_1
    if-nez v0, :cond_2

    .line 582
    invoke-virtual {v3}, Ll/ܽۘᩴ;->ᩴ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Ll/ܽۘᩴ;->ᩴ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    :cond_2
    if-nez v0, :cond_3

    .line 583
    invoke-virtual {v3}, Ll/ܽۘᩴ;->᩸()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Ll/ܽۘᩴ;->᩸()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_3
    return v0
.end method
