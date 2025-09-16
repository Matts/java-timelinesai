package io.github.matts.timelinesai.responses;

import io.github.matts.timelinesai.model.api.WhatsappAccountEntry;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WhatsappAccountResponseData {
    private List<WhatsappAccountEntry> whatsapp_accounts;
}
