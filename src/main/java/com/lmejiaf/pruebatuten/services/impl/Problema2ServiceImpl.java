package com.lmejiaf.pruebatuten.services.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lmejiaf.pruebatuten.dto.Problema2RequestDTO;
import com.lmejiaf.pruebatuten.dto.Problema2ResponseDTO;
import com.lmejiaf.pruebatuten.services.IProblema2Service;

@Service
public class Problema2ServiceImpl implements IProblema2Service {

	@Override
	public ResponseEntity<Problema2ResponseDTO> convertir(Problema2RequestDTO data) {
		// TODO Auto-generated method stub

		// TimeZone tz= TimeZone.getTimeZone("UTC"+data.getTimezone()+":00");

		// capturar la hora
		// Instant instant=
		// Instant.parse(LocalDate.now(tz.toZoneId()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
		// + "T" + data.getHora().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + "Z"
		// );

		// Calendar calendar= Calendar.getInstance();
		// Date date= Date.from(instant)
		// calendar.setTime(data.getHora().get);

		// +3 le quita 3
		// - 3 le suma 3

		LocalTime lt;
		if(data.getTimezone()<-14 || data.getTimezone()>14)
			return ResponseEntity.badRequest().body(new Problema2ResponseDTO("",""));
		if (data.getTimezone() < 0) {
			lt = data.getHora().plusHours(Math.abs(Long.valueOf(data.getTimezone())));
		}
		else if (data.getTimezone() > 0) {
			lt = data.getHora().minusHours(Math.abs(Long.valueOf(data.getTimezone())));
		}
		else {
			lt= data.getHora();
		}

		// ZoneId zoneId_UTC = ZoneId.of("UTC");
		// ZoneId zoneId = ZoneId.of("UTC"+data.getTimezone());

		// ZonedDateTime zdt= ZonedDateTime.ofInstant(instant, zoneId_UTC);

		// System.out.println(instant);
		// System.out.println("");

		// pasar a UTC

		// ZonedDateTime zdt_UTC = zdt.withZoneSameInstant( zoneId_UTC );

		// LocalTime.now(tzo.toZoneId()).toString()

		// zdt.format(DateTimeFormatter.ofPattern("HH:mm:ss"))

		return ResponseEntity.ok(new Problema2ResponseDTO(lt.toString(), "utc"));

	}

}
